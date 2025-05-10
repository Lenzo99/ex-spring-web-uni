package com.exercise.uni.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.exercise.uni.entity.Course;
import com.exercise.uni.entity.Student;
import com.exercise.uni.entity.Technical;
import com.exercise.uni.repository.CourseRepository;
import com.exercise.uni.repository.TechnicalRepository;

@Service
public class TechnicalService {
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private TechnicalRepository technicalRepository;
	
	/* Insert a new course.
	 * */
	public void insertCourse(int id_course, String name) {
		if( name.isEmpty() ) {
    		throw new IllegalArgumentException("Campo nome non valido.");
		} else {
			Course course = new Course();
			course.setIdCourse(id_course);
			course.setName(name);
			courseRepository.save( course );
		}
	}
	
	/* Delete a course.
	 * */
	public void deleteCourse(int id_course) {
		if( !courseRepository.existsById(id_course) ) {
    		throw new IllegalArgumentException("Corso non esistente.");
		} else {
			courseRepository.deleteById( id_course );
		}
	}

    /* Insert a new technical.
     * */
    public void insertTechnical(String name, String surname, String email, String password,
    						  int id_technical, String tel) {
    	if( name.isEmpty() && surname.isEmpty() && email.isEmpty() && password.isEmpty()
    		&& tel.isEmpty() ) {
    		throw new IllegalArgumentException("Almeno un attributo e' vuoto.");
    	} else if( technicalRepository.existsById(id_technical) ) {
    		throw new IllegalArgumentException("Tecnico gia' esistente.");
    	} else {
    		Technical technical = new Technical();
    		technical.setName(name);
    		technical.setSurname(surname);
    		technical.setEmail(email);
    		technical.setPassword(password);
    		technical.setIdTechnical(id_technical);
    		technical.setTel(tel);
    		technicalRepository.save( technical );
    	}
    }
    
    /* Delete a student.
     * */
    public void deleteTechnical(int id_technical) {
    	if( !technicalRepository.existsById(id_technical) ) {
    		throw new IllegalArgumentException("Tecnico inesistente.");
    	} else {
    		technicalRepository.deleteById(id_technical);
    	}
    }
}
