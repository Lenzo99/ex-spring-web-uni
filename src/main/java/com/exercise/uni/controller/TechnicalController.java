package com.exercise.uni.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exercise.uni.dto.TechnicalDTO;
import com.exercise.uni.facade.TechnicalFacade;

@RestController
@RequestMapping("/technical")
public class TechnicalController {
	@Autowired
	private TechnicalFacade technicalFacade;
	
	@PostMapping
	public ResponseEntity<Object> insertTechnical(@RequestBody TechnicalDTO technicalDto) {
		ResponseEntity<Object> re = new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		
		if( !isEmptyField(technicalDto.getName()) &&
				!isEmptyField(technicalDto.getSurname()) &&
				!isEmptyField(technicalDto.getEmail()) &&
				!isEmptyField(technicalDto.getPassword()) && 
				!isEmptyField(technicalDto.getTel()) ) {
			technicalFacade.insertTechnical(technicalDto);
			re = new ResponseEntity<Object>(HttpStatus.OK);
		}
		
		return re;
	}
	
	@DeleteMapping("{/idTechnical}")
    public ResponseEntity<Object> deleteTechnical(@PathVariable int idTechnical) {
		ResponseEntity<Object> re = new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		
		if( idTechnical > 0 ) {
			technicalFacade.deleteTechnical(idTechnical);
			re = new ResponseEntity<Object>(HttpStatus.OK);
		}
		
		return re;
    }
    
	@PostMapping("/{courseName}")
	public ResponseEntity<Object> insertCourse(String courseName) {
		ResponseEntity<Object> re = new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		
		if( !isEmptyField(courseName) ) {
			technicalFacade.insertCourse(courseName);
			re = new ResponseEntity<Object>(HttpStatus.OK);
		}
		
		return re;
	}
    
	@DeleteMapping("/{courseName}")
	public ResponseEntity<Object> deleteCourse(String courseName) {
		ResponseEntity<Object> re = new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);

		if( !isEmptyField(courseName) ) {
			technicalFacade.deleteCourse(courseName);
			re = new ResponseEntity<Object>(HttpStatus.OK);
		}
		
		return re;
	}
    
	/* Checks form emptiness.
	 * @param str is the field to check.
	 * @return true if the field is empty.
	 */
	private boolean isEmptyField(String str) {
		return (str == null || str.trim().isEmpty());
	}
}
