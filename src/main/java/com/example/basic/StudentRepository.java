package com.example.basic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentrepository")
public interface StudentRepository extends JpaRepository<Student, Long>{

}