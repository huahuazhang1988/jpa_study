package com.it.jpa_day2.domain;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="t_id")
    private Integer id;
    @Column(name ="t_name")
    private String name;
    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    //@JoinColumn(name="t_id",referencedColumnName = "t_id")
     private List<Student> list=new ArrayList<>();

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public Teacher() {
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
