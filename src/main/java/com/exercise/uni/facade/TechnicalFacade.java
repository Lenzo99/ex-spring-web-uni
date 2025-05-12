package com.exercise.uni.facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.exercise.uni.dto.CourseDTO;
import com.exercise.uni.dto.TechnicalDTO;
import com.exercise.uni.service.TechnicalService;

@Component
public class TechnicalFacade {
	@Autowired
	private TechnicalService technicalService;

	// Services
	public void insertTechnical(TechnicalDTO technicalDto) {
		technicalService.insertTechnical(technicalDto);
	}
	
    public void deleteTechnical(int idTechnical) {
    	technicalService.deleteTechnical(idTechnical);
    }
    
	public void insertCourse(String courseName) {
    	technicalService.insertCourse(courseName);
	}
    
	public void deleteCourse(String name) {
		technicalService.deleteCourse(name);
	}
}
