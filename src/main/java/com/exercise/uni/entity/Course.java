package com.exercise.uni.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@Column(name="id_course")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCourse;
	
	@Column(name="name", length=50, nullable=false, unique=true)
	private String name;
	
	
	// Constructor
	public Course() {}
	
	// Setter/Getter
	public void setIdCourse(int idCourse) { this.idCourse = idCourse; }
	public int getIdCourse() { return idCourse; }
	
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
}
