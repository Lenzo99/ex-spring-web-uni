package com.exercise.uni.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercise.uni.entity.Student;
import com.exercise.uni.entity.Enrollment;
import com.exercise.uni.entity.EnrollmentId;
import com.exercise.uni.repository.StudentRepository;
import com.exercise.uni.repository.CourseRepository;
import com.exercise.uni.repository.EnrollmentRepository;
import java.time.LocalDateTime;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    /* Insert a new student.
     * */
    public void insertStudent(String name, String surname, String email, String password,
    						  String cf, String curriculum) {
    	if( name.isEmpty() && surname.isEmpty() && email.isEmpty() && password.isEmpty()
    		&& cf.isEmpty() && curriculum.isEmpty() ) {
    		throw new IllegalArgumentException("Almeno un attributo e' vuoto.");
    	} else if( studentRepository.existsById(cf) ) {
    		throw new IllegalArgumentException("Studente gia' esistente.");
    	} else {
    		Student student = new Student();
    		student.setName(name);
    		student.setSurname(surname);
    		student.setEmail(email);
    		student.setPassword(password);
    		student.setCf(cf);
    		student.setCurriculum(curriculum);
    		studentRepository.save( student );
    	}
    }
    
    /* Delete a student.
     * */
    public void deleteStudent(String cf) {
    	if( cf.isEmpty() || !studentRepository.existsById(cf) ) {
    		throw new IllegalArgumentException("id inesistente.");
    	} else {
    		studentRepository.deleteById(cf);
    	}
    }
    
    /* Enroll a student in a course.
     * */
    public void enrollStudentToCourse(String cf, int id_course) {
    	if( cf.isEmpty() || studentRepository.existsById(cf) ) {
    		throw new IllegalArgumentException("Studente inesistente.");
    	} else if( !courseRepository.existsById(id_course) ){
    		throw new IllegalArgumentException("Corso inesistente.");
    	} else {
    		Enrollment enrollment = new Enrollment();
    		enrollment.setStudent( studentRepository.findById(cf).get() );
    		enrollment.setCourse( courseRepository.findById(id_course).get() );
    		enrollment.setDate( LocalDateTime.now() );
    		enrollmentRepository.save( enrollment );
    	}
    }
    
    /* Un-enroll a student from a course.
     * */
    public void unenrollStudentFromCourse(String cf, int id_course) {
    	if( cf.isEmpty() || studentRepository.existsById(cf) ) {
    		throw new IllegalArgumentException("Studente inesistente.");
    	} else if( !courseRepository.existsById(id_course) ){
    		throw new IllegalArgumentException("Corso inesistente.");
    	} else {
    		EnrollmentId enrollmentId = new EnrollmentId();
    		enrollmentId.setCf(cf);
    		enrollmentId.setIdCourse(id_course);
    		enrollmentRepository.deleteById( enrollmentId );
    	}
    }
}