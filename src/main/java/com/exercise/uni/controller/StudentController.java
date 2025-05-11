package com.exercise.uni.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.exercise.uni.facade.StudentFacade;
import com.exercise.uni.dto.StudentDTO;

@RestController
@RequestMapping("/student")
public class StudentController {
	private final StudentFacade studentFacade;
	
	/* CONSTROCTUR */
	public StudentController(StudentFacade studentFacade) {
		this.studentFacade = studentFacade;
	}
	
	/* SERVICES */
    @PostMapping
    public ResponseEntity<String> insertStudent(@RequestBody StudentDTO studentDTO) {
        studentFacade.insertStudent(
            studentDTO.name,
            studentDTO.surname,
            studentDTO.email,
            studentDTO.password,
            studentDTO.cf,
            studentDTO.curriculum
        );
        return ResponseEntity.ok("Studente inserito con successo.");
    }
    
    @PostMapping
    public ResponseEntity<String> deleteStudent(@PathVariable String cf) {
        studentFacade.deleteStudent(cf);
        return ResponseEntity.ok("Studente eliminato con successo.");
    }
    
    @PostMapping
    public ResponseEntity<String> enrollStudentToCourse(@PathVariable String cf, @PathVariable int id_course)  {
        studentFacade.enrollStudentToCourse(cf, id_course);
        return ResponseEntity.ok("Studente iscritto al corso con successo.");
    }
    
    @PostMapping
    public ResponseEntity<String> unenrollStudentFromCourse(@PathVariable String cf, @PathVariable int id_course)  {
        studentFacade.unenrollStudentFromCourse(cf, id_course);
        return ResponseEntity.ok("Studente disiscritto al corso con successo.");
    }
}
