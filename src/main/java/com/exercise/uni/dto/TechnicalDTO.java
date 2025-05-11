package com.exercise.uni.dto;

public class TechnicalDTO {
    public String name;
    public String surname;
    public String email;
    public String password;
    public int id_technical;
	public String tel;
    
    
    public TechnicalDTO() {}
    
    
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	
	public void setSurname(String surname) { this.surname = surname; }
	public String getSurname() 	{ return surname; }
	
	public void setEmail(String email) { this.email =  email; }
	public String getEmail() { return email; }
	
	public void setPassword(String password) { this.password = password; }
	public String getPassword() { return password; }
	
	public void setIdTechnical(int id_technical) { this.id_technical = id_technical; }
	public int getIdTechnical() { return id_technical; }
	
	public void setTel(String tel) { this.tel = tel; }
	public String getTel() { return tel; }

}
