//package com.save.hibernate;
//
//import javax.annotation.Nonnull;
//import javax.persistence.*;
//
//@Entity
//public class Employee {
//
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private int E_id;
//    
//    @Nonnull
//    private String E_name;
//    
//    @OneToOne(targetEntity = Employee.class, cascade = CascadeType.ALL)
//    private Department dept;
//    
//    public Employee() {
//        super();
//    }
//
//    
//    public Employee(int e_id, String e_name, Department dept) {
//        super();
//        E_id = e_id;
//        E_name = e_name;
//        this.dept = dept;
//    }
//
//
//    public int getE_id() {
//        return E_id;
//    }
//
//    public void setE_id(int e_id) {
//        E_id = e_id;
//    }
//
//    public String getE_name() {
//        return E_name;
//    }
//
//    public void setE_name(String e_name) {
//        E_name = e_name;
//    }
//    
//    
//}
