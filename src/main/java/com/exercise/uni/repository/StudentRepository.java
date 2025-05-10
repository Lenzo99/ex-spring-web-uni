package com.exercise.uni.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exercise.uni.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
    // No custom for now
}