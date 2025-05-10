package com.exercise.uni.entity;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@IdClass(EnrollmentId.class)
@Table(name = "enrollment")
public class Enrollment {
	@Id
	@ManyToOne
	@JoinColumn(name = "cf", referencedColumnName ="cf")
	private Student student;
	@Id
	@ManyToOne
	@JoinColumn(name = "id_course", referencedColumnName ="id_course")
	private Course course;
	private LocalDateTime date;
	
	/* CONSTRUCTOR */
	public Enrollment() {}
	
	/* SETTER/GETTER */
	public void setStudent(Student student) { this.student = student; }
	public Student getStudent() { return student; }
	
	public void setCourse(Course course) { this.course = course; }
	public Course getCourse() { return course; }
	
	public void setDate(LocalDateTime date) { this.date = date; }
	public LocalDateTime getDate() { return date; }
}
