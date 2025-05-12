package com.exercise.uni.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exercise.uni.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
    // Checks for an existed course by name
	boolean existsByName(String name);
	
	// Finds the course with that name
	Optional<Course> findByName(String name); 
	
	// Deletes the course with that name
	void deleteByName(String name);
}