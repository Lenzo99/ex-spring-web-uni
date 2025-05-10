package com.exercise.uni.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Technical")
public class Technical extends Person{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tec;
	private String tel;
	
	/* CONSTRUCTOR */
	public Technical() {}
	
	/* SETTER/GETTER */
	public void setIdTec(int id_tec) { this.id_tec = id_tec; }
	public int getIdTec() { return id_tec; }
	
	public void setTel(String tel) { this.tel = tel; }
	public String getTel() { return tel; }
}
