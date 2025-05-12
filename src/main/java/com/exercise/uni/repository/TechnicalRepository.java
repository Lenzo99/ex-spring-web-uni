package com.exercise.uni.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exercise.uni.entity.Technical;

@Repository
public interface TechnicalRepository extends JpaRepository<Technical, Integer> {
	// No custom for now
}