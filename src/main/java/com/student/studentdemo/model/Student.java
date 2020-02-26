package com.student.studentdemo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Student(Long id, String firstName, String lastName, Classroom classroom) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.classroom = classroom;
    }
}

