package com.exercise.uni.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.exercise.uni.entity.Course;
import com.exercise.uni.entity.Technical;
import com.exercise.uni.dto.CourseDTO;
import com.exercise.uni.dto.TechnicalDTO;
import com.exercise.uni.repository.CourseRepository;
import com.exercise.uni.repository.TechnicalRepository;

@Service
public class TechnicalService {
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private TechnicalRepository technicalRepository;

	// Insert a new technical
	public void insertTechnical(TechnicalDTO technicalDto) {
    	Technical technical = new Technical();
    	technical.setName( technicalDto.getName() );
    	technical.setSurname( technicalDto.getSurname() );
    	technical.setEmail( technicalDto.getEmail() );
    	technical.setPassword( technicalDto.getPassword() );
    	technical.setTel( technicalDto.getTel() );
    	technicalRepository.save(technical);
	}
	
	// Delete a technical
    public void deleteTechnical(int idTechnical) {
    	if( !technicalRepository.existsById(idTechnical) ) {
    		throw new IllegalArgumentException("Tecnico inesistente.");
    	} else {
    		technicalRepository.deleteById(idTechnical);
    	}
    }
    
	// Insert a new course
	public void insertCourse(String courseName) {
    	if( courseRepository.existsByName(courseName) ) {
    		throw new IllegalArgumentException("Corso gia' esistente.");
    	} else {
        	Course course = new Course();
        	course.setName(courseName);
        	courseRepository.save(course);
    	}
	}
    
	// Delete a course
	public void deleteCourse(String name) {
		if( !courseRepository.existsByName(name) ) {
			throw new IllegalArgumentException("Corso inesistente.");
		} else {
			courseRepository.deleteByName(name);
		}
	}
}
