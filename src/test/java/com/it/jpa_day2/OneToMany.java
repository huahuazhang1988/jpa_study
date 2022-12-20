package com.it.jpa_day2;


import com.it.jpa_day2.dao.StudentDao;
import com.it.jpa_day2.dao.TeacherDao;
import com.it.jpa_day2.domain.Student;
import com.it.jpa_day2.domain.Teacher;
import jakarta.transaction.Transactional;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;


@Slf4j
@SpringBootTest
public class OneToMany {
    @Autowired
    TeacherDao teacherDao;
    @Autowired
    StudentDao studentDao;
    @Test
    @Transactional
    @Rollback(value = false)
    public void testAdd(){
        Teacher teacher = new Teacher();
        teacher.setName("lisi");
        Student student = new Student();
        student.setName("zhangsan");
       // student.setTeacher(teacher);
        teacher.getList().add(student);

        studentDao.save(student);
        teacherDao.save(teacher);


    }
}
