package com.exercise.uni.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "technical")
public class Technical extends Person{
	@Id
	@Column(name="id_technical")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTechnical;
	
	@Column(name="tel", length=15, nullable=true, unique=true)
	private String tel;
	
	
	// Constructor
	public Technical() {}
	
	// Setter/Getter
	public void setIdTechnical(int idTechnical) { this.idTechnical = idTechnical; }
	public int getIdTechnical() { return idTechnical; }
	
	public void setTel(String tel) { this.tel = tel; }
	public String getTel() { return tel; }
}
