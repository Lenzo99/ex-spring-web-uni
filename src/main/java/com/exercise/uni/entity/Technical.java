package com.exercise.uni.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "technical")
public class Technical extends Person{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_technical;
	private String tel;
	
	/* CONSTRUCTOR */
	public Technical() {}
	
	/* SETTER/GETTER */
	public void setIdTechnical(int id_technical) { this.id_technical = id_technical; }
	public int getIdTechnical() { return id_technical; }
	
	public void setTel(String tel) { this.tel = tel; }
	public String getTel() { return tel; }
}
