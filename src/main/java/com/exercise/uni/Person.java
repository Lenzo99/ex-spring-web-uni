package com.exercise.uni;
import jakarta.persistence.*;

@MappedSuperclass
public abstract class Person {
	private String name;
	private String surname;
	private String email;
	private String password;
	
	/* SETTER/GETTER */
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	
	public void setSurname(String surname) { this.surname = surname; }
	public String getSurname() 	{ return surname; }
	
	public void setEmail(String email) { this.email =  email; }
	public String getEmail() { return email; }
	
	public void setPassword(String password) { this.password = password; }
	public String getPassword() { return password; }
}
