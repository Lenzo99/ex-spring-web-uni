package com.exercise.uni.dto;

public class TechnicalDTO {
    public String name;
    public String surname;
    public String email;
    public String password;
	public String tel;
    
    // Constructor
	public TechnicalDTO() {}
    public TechnicalDTO(String name, String surname, String email, String password,
    		String tel) {
    	this.name = name;
    	this.surname = surname;
    	this.email = email;
    	this.password = password;
    	this.tel = tel;
    }
    
    // Setter/Getter
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	
	public void setSurname(String surname) { this.surname = surname; }
	public String getSurname() 	{ return surname; }
	
	public void setEmail(String email) { this.email =  email; }
	public String getEmail() { return email; }
	
	public void setPassword(String password) { this.password = password; }
	public String getPassword() { return password; }
	
	public void setTel(String tel) { this.tel = tel; }
	public String getTel() { return tel; }

}
