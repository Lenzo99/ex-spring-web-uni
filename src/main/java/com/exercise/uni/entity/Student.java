package com.exercise.uni.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student extends Person{
	@Id
	@Column(name="cf", length=16)
	private String cf;
	
	@Column(name="curriculum", length=50, nullable=false, unique=false)
	private String curriculum;
	
	
	// Constructor
	public Student() {}
	
	// Setter/Getter
	public void setCf(String cf) { this.cf = cf; }
	public String getCf() { return cf; }
	
	public void setCurriculum(String curriculum) { this.curriculum = curriculum; }
	public String getCurriculum() { return curriculum; }
}
