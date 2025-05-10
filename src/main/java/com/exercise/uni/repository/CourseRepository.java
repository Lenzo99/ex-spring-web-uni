package com.exercise.uni.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exercise.uni.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    // No custom for now
}