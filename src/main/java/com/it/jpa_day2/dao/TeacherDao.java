package com.it.jpa_day2.dao;


import com.it.jpa_day2.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TeacherDao extends JpaRepository<Teacher,Integer>, JpaSpecificationExecutor<Teacher> {
}
