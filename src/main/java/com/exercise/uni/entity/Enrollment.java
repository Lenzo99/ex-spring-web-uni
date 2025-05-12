package com.exercise.uni.entity;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity
@IdClass(EnrollmentId.class)
@Table(name = "enrollment")
public class Enrollment {
	@ManyToOne
	@MapsId("cf")
	@JoinColumn(name="cf")
	private Student student;
	
	@ManyToOne
	@MapsId("idCorso")
	@JoinColumn(name="id_course")
	private Course course;
	
	@Column(name="timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private LocalDateTime timestamp;
	
	
	// Constructor
	public Enrollment() {}
	
	// Setter/Getter
	public void setStudent(Student student) { this.student = student; }
	public Student getStudent() { return student; }
	
	public void setCourse(Course course) { this.course = course; }
	public Course getCourse() { return course; }
	
	public void setDate(LocalDateTime timestamp) { this.timestamp = timestamp; }
	public LocalDateTime getDate() { return timestamp; }
}
