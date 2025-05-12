package com.exercise.uni.entity;
import jakarta.persistence.*;

@MappedSuperclass
public abstract class Person {
	@Column(name="name", length=40, nullable=false, unique=false)
	private String name;
	
	@Column(name="surname", length=40, nullable=false, unique=false)
	private String surname;
	
	@Column(name="email", length=50, nullable=false, unique=false)
	private String email;
	
	@Column(name="password", length=50, nullable=false, unique=false)
	private String password;
	
	
	//  Setter/Getter
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	
	public void setSurname(String surname) { this.surname = surname; }
	public String getSurname() 	{ return surname; }
	
	public void setEmail(String email) { this.email =  email; }
	public String getEmail() { return email; }
	
	public void setPassword(String password) { this.password = password; }
	public String getPassword() { return password; }
}
