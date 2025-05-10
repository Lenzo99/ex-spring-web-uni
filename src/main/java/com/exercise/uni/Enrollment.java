package com.exercise.uni;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@IdClass(EnrollmentId.class)
@Table(name = "enrollment")
public class Enrollment {
	@Id
	@ManyToOne
	@JoinColumn(name = "cf", referencedColumnName ="cf")
	private Student student;
	@Id
	@ManyToOne
	@JoinColumn(name = "id_cou")
	private Course course;
	private LocalDateTime datatime;
	
	/* CONSTRUCTOR */
	public Enrollment() {}
	
	/* SETTER/GETTER */
}
