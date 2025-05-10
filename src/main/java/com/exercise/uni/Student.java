package com.exercise.uni;
import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student extends Person{
	@Id
	private String cf;
	private String curriculum;
	
	/* CONSTRUCTOR */
	public Student() {}
	
	/* SETTER/GETTER */
	public void setCf(String cf) { this.cf = cf; }
	public String getCf() { return cf; }
	
	public void setCurriculum(String curriculum) { this.curriculum = curriculum; }
	public String getCurriculum() { return curriculum; }
}
