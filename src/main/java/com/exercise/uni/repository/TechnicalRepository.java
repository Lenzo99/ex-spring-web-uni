package com.exercise.uni.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.exercise.uni.entity.Technical;

public interface TechnicalRepository extends JpaRepository<Technical, Integer> {
	// No custom for now
}