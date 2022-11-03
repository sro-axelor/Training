package com.hibernate.project.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class School {
    @Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
    private int s_no;

    private String s_name;

    @OneToOne(targetEntity = Teacher.class, cascade = CascadeType.ALL)
    private Teacher tr;

    public School() {
        super();
    }

    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Teacher getTr() {
        return tr;
    }

    public void setTr(Teacher tr) {
        this.tr = tr;
    }

    @Override
    public String toString() {
        return "School [s_no=" + s_no + ", s_name=" + s_name + ", tr=" + tr + "]";
    }

}
