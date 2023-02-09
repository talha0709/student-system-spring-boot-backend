package com.Talha.StudentSystem.repositry;


import com.Talha.StudentSystem.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepositry extends JpaRepository<student, Integer> {
}
