package com.exercise.uni.facade;
import org.springframework.stereotype.Service;
import com.exercise.uni.service.StudentService;

@Service
public class StudentFacade {
	private final StudentService studentService;
	
	/* CONSTRUTCTOR */
	public StudentFacade(StudentService studentService) {
		this.studentService = studentService;
	}
	
	/* SERVICES */
	public void insertStudent(String name, String surname, String email, String password,
			  			 String cf, String curriculum) {
		studentService.insertStudent(name, surname, email, password, cf, curriculum);
	}

    public void deleteStudent(String cf) {
    	studentService.deleteStudent(cf);
    }
    
    public void enrollStudentToCourse(String cf, int id_course) {
    	studentService.enrollStudentToCourse(cf, id_course);
    }
    
    public void unenrollStudentFromCourse(String cf, int id_course) {
    	studentService.unenrollStudentFromCourse(cf, id_course);
    }
}
