package com.it.jpa_day2.dao;


import com.it.jpa_day2.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StudentDao extends JpaRepository<Student,Integer>, JpaSpecificationExecutor<Student> {
}
