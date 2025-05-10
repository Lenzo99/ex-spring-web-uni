package com.exercise.uni.entity;
import jakarta.persistence.*;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cou;
	private String name;
	
	/* CONSTRUCTOR */
	public Course() {}
	
	/* SETTER/GETETR */
	public void setIdCou(int id_cou) { this.id_cou = id_cou; }
	public int getIdCou() { return id_cou; }
	
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	
}
