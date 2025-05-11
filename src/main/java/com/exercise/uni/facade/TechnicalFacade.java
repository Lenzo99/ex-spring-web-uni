package com.exercise.uni.facade;
import org.springframework.stereotype.Service;
import com.exercise.uni.service.TechnicalService;

@Service
public class TechnicalFacade {
	private final TechnicalService technicalService;
	
	/* CONSTRUCTOR */
	public TechnicalFacade(TechnicalService technicalService) {
		this.technicalService = technicalService;
	}

	/* SERVICES */
	public void insertCourse(int id_course, String name) {
		technicalService.insertCourse(id_course, name);
	}
	
	public void deleteCourse(int id_course) {
		technicalService.deleteCourse(id_course);
	}

    public void insertTechnical(String name, String surname, String email, String password,
    						  int id_technical, String tel) {
    	technicalService.insertTechnical(name, surname, email, password, id_technical, tel);
    }
    
    public void deleteTechnical(int id_technical) {
    	technicalService.deleteTechnical(id_technical);
    }
}
