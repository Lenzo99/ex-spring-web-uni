package com.exercise.uni.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exercise.uni.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
    // No custom for now
}