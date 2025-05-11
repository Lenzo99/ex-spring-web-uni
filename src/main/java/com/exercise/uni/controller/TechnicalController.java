package com.exercise.uni.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.exercise.uni.dto.TechnicalDTO;
import com.exercise.uni.entity.Course;
import com.exercise.uni.entity.Technical;
import com.exercise.uni.facade.TechnicalFacade;

public class TechnicalController {
	private final TechnicalFacade technicalFacade;
	
	/* CONSTRUCTOR */
	public TechnicalController(TechnicalFacade technicalFacade) {
		this.technicalFacade = technicalFacade;
	}
	
	/* SERVICES */
    @PostMapping
    public ResponseEntity<String> insertCourse(@PathVariable int id_course, @PathVariable String name) {
    	technicalFacade.insertCourse(id_course, name);
        return ResponseEntity.ok("Corso inserito con successo.");
    }
    
    @PostMapping
    public ResponseEntity<String> deleteCourse(@PathVariable int id_course) {
    	technicalFacade.deleteCourse(id_course);
        return ResponseEntity.ok("Corso rimosso con successo.");
    }
    
    @PostMapping
    public ResponseEntity<String> insertTechnical(@RequestBody TechnicalDTO technicalDTO) {
        technicalFacade.insertTechnical(
        		technicalDTO.name,
        		technicalDTO.surname,
        		technicalDTO.email,
                technicalDTO.password,
                technicalDTO.id_technical,
                technicalDTO.tel
            );
            return ResponseEntity.ok("Tecnico inserito con successo.");
    }
    
    @PostMapping
    public ResponseEntity<String> deleteTechnical(@PathVariable int id_technical) {
    	technicalFacade.deleteTechnical(id_technical);
        return ResponseEntity.ok("Tecnico rimosso con successo.");
    }
}
