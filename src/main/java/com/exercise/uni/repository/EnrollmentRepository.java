package com.exercise.uni.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exercise.uni.entity.Enrollment;
import com.exercise.uni.entity.EnrollmentId;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentId> {
    // No custom for now
}