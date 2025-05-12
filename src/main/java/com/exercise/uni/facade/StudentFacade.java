package com.exercise.uni.facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.exercise.uni.dto.StudentDTO;
import com.exercise.uni.service.StudentService;

@Component
public class StudentFacade {
	@Autowired
	private StudentService studentService;

	// Services
	public void insertStudent(StudentDTO studentDto) {
		studentService.insertStudent(studentDto);
	}
	
	public void deleteStudent(String cf) {
		studentService.deleteStudent(cf);
	}
	
	public void enrollStudentToCourse(String cf, String courseName) {
		studentService.enrollStudentToCourse(cf, courseName);
	}
	
	public void unenrollStudentFromCourse(String cf, String courseName) {
		studentService.unenrollStudentFromCourse(cf, courseName);
	}
}
