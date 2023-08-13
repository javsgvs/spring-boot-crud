package com.api.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crud.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
