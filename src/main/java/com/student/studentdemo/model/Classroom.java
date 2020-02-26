package com.student.studentdemo.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;


@Data
@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "classroom")
//    @JoinColumn(name = "classroom")
    private List<Student> studentsList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public Classroom(Long id, List<Student> studentsList) {
        this.id = id;
        this.studentsList = studentsList;
    }
}
