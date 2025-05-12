package com.exercise.uni.dto;

public class CourseDTO {
	private String name;
	
	// Constructor
	public CourseDTO() {}
	public CourseDTO(String name) {
		this.name = name;
	}
	
	// Setter/Getter
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
}
