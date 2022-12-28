package com.hibernate.project.services;

import com.hibernate.project.entity.Student1;

public class StudentService {
  
    public Student1 createStudent1(Integer sid,String sname) {
  
        Student1 stud =new Student1();
        stud.setS1_id(sid);
        stud.setS1_name(sname);
        return stud;
        
    }
    
}
