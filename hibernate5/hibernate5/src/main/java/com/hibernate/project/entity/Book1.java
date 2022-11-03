package com.hibernate.project.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book1 {

    @Id
    private int B1_id;

    private String B1_name;

    @ManyToOne(cascade = CascadeType.ALL,targetEntity = Student1.class)
   // @JoinColumn
    private Student1 stud;

    public Book1() {
        super();
    }

    public Book1(int b1_id, String b1_name, Student1 stud) {
        super();
        B1_id = b1_id;
        B1_name = b1_name;
        this.stud = stud;
    }

    public int getB1_id() {
        return B1_id;
    }

    public void setB1_id(int b1_id) {
        B1_id = b1_id;
    }

    public String getB1_name() {
        return B1_name;
    }

    public void setB1_name(String b1_name) {
        B1_name = b1_name;
    }

    public Student1 getStud() {
        return stud;
    }

    public void setStud(Student1 stud) {
        this.stud = stud;
    }

   
}
