package com.exercise.uni.dto;

public class StudentDTO {
    public String name;
    public String surname;
    public String email;
    public String password;
    public String cf;
    public String curriculum;
    
    
    public StudentDTO() {}
    
    
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	
	public void setSurname(String surname) { this.surname = surname; }
	public String getSurname() 	{ return surname; }
	
	public void setEmail(String email) { this.email =  email; }
	public String getEmail() { return email; }
	
	public void setPassword(String password) { this.password = password; }
	public String getPassword() { return password; }
    
	public void setCf(String cf) { this.cf = cf; }
	public String getCf() { return cf; }
	
	public void setCurriculum(String curriculum) { this.curriculum = curriculum; }
	public String getCurriculum() 	{ return curriculum; }

}
