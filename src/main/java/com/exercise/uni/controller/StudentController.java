package com.exercise.uni.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.exercise.uni.facade.StudentFacade;
import com.exercise.uni.dto.StudentDTO;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentFacade studentFacade;
	
	@PostMapping
    public ResponseEntity<Object> insertStudent(@RequestBody StudentDTO studentDto) {
		ResponseEntity<Object> re = new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		
		if( !isEmptyField(studentDto.getName()) &&
				!isEmptyField(studentDto.getSurname()) &&
				!isEmptyField(studentDto.getEmail()) &&
				!isEmptyField(studentDto.getPassword()) && 
				!isEmptyField(studentDto.getCf()) &&
				!isEmptyField(studentDto.getCurriculum()) ) {
			studentFacade.insertStudent(studentDto);
			re = new ResponseEntity<Object>(HttpStatus.OK);
		}
		
		return re;
    }
	
	@DeleteMapping("/{cf}")
	public ResponseEntity<Object> deleteStudent(@PathVariable String cf){
		ResponseEntity<Object> re = new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		
		if( !isEmptyField(cf) ) {
			studentFacade.deleteStudent(cf);
			re = new ResponseEntity<Object>(HttpStatus.OK);
		}
		
		return re;
	}
	
	@PostMapping("/{cf}/enroll/{courseName}")
	public ResponseEntity<Object> enrollStudentToCourse(@PathVariable String cf,
			@PathVariable String courseName){
		ResponseEntity<Object> re = new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		
		if( !isEmptyField(cf) && !isEmptyField(courseName) ) {
			studentFacade.enrollStudentToCourse(cf, courseName);
			re = new ResponseEntity<Object>(HttpStatus.OK);
		}
		
		return re;
	}
	
	@DeleteMapping("/{cf}/enroll/{courseName}")
	public ResponseEntity<Object> unenrollStudentFromCourse(@PathVariable String cf,
			@PathVariable String courseName){
		ResponseEntity<Object> re = new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		
		if( !isEmptyField(cf) && !isEmptyField(courseName) ) {
			studentFacade.unenrollStudentFromCourse(cf, courseName);
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
    
    /* Cosi' e' come lo ha fatto Ciwi.
    @PostMapping
    public ResponseEntity<Object> unenrollStudentFromCourse(@PathVariable String cf, @PathVariable int id_course)  {
        studentFacade.unenrollStudentFromCourse(cf, id_course);
        return new ResponseEntity<>(studentFacade.unenrollStudentFromCourse(cf, id_course), HttpStatus.OK);
    }*/
}
