package com.exercise.uni.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_course;
	private String name;
	
	/* CONSTRUCTOR */
	public Course() {}
	
	/* SETTER/GETETR */
	public void setIdCourse(int id_course) { this.id_course = id_course; }
	public int getIdCourse() { return id_course; }
	
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	
}
