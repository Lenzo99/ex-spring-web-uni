package com.exercise.uni.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.exercise.uni.dto.StudentDTO;
import com.exercise.uni.entity.Student;
import com.exercise.uni.entity.Enrollment;
import com.exercise.uni.entity.EnrollmentId;
import com.exercise.uni.repository.StudentRepository;
import com.exercise.uni.repository.CourseRepository;
import com.exercise.uni.repository.EnrollmentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    // Insert a new student
    public void insertStudent(StudentDTO studentDto) {
    	if( studentRepository.existsById(studentDto.getCf()) ) {
    		throw new IllegalArgumentException("Studente gia' iscritto.");
    	} else {
        	Student student = new Student();
        	student.setName( studentDto.getName() );
        	student.setSurname( studentDto.getSurname() );
        	student.setEmail( studentDto.getEmail() );
        	student.setPassword( studentDto.getPassword() );
        	student.setCf( studentDto.getCf() );
        	student.setCurriculum( studentDto.getCurriculum() );
        	studentRepository.save(student);
    	}
    }
    
    // Delete a student
    public void deleteStudent(String cf) {
    	if( !studentRepository.existsById(cf) ) {
    		throw new IllegalArgumentException("Studente inesistente.");
    	} else {
    		studentRepository.deleteById(cf);
    	}
    }
    
    // Enroll a student in a course
    public void enrollStudentToCourse(String cf, String courseName) {
    	if( !studentRepository.existsById(cf) ) {
    		throw new IllegalArgumentException("Studente inesistente.");
    	} else if( !courseRepository.existsByName(courseName) ) {
    		throw new IllegalArgumentException("Corso inesistente.");
    	} else {
    		Enrollment enrollment = new Enrollment();
    		enrollment.setStudent( studentRepository.findById(cf).get() );
    		enrollment.setCourse( courseRepository.findByName(courseName).get() );
    		enrollmentRepository.save(enrollment);
    	}
    }
    
    // Un-enroll a student from a course
    public void unenrollStudentFromCourse(String cf, String courseName) {
    	if( !studentRepository.existsById(cf) ) {
    		throw new IllegalArgumentException("Studente inesistente.");
    	} else if( !courseRepository.existsByName(courseName) ) {
    		throw new IllegalArgumentException("Corso inesistente.");
    	} else {
    		EnrollmentId id = new EnrollmentId();
    		id.setCf(cf);
    		id.setIdCourse( courseRepository.findByName(courseName).get().getIdCourse() );
    		enrollmentRepository.deleteById(id);
    	}
    }
    
    
    
    /* Un-enroll a student from a course.
     * *
    public int unenrollStudentFromCourse(String cf, int id_course) {
    	if( cf.isEmpty() || studentRepository.existsById(cf) ) {
    		throw new IllegalArgumentException("Studente inesistente.");
    	} else if( !courseRepository.existsById(id_course) ){
    		throw new IllegalArgumentException("Corso inesistente.");
    	} else {
    		EnrollmentId enrollmentId = new EnrollmentId();
    		enrollmentId.setCf(cf);
    		enrollmentId.setIdCourse(id_course);
    		enrollmentRepository.deleteById( enrollmentId );
    		return id_course;
    	}
    }*/
}