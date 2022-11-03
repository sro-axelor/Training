package com.hibernate.project.services;

import com.hibernate.project.entity.Teacher;

public class Teacherservice {

    public Teacher createTeacher(Integer tid,String tname) {
        
        Teacher tr=new Teacher();
        tr.setT_id(tid);
        tr.setT_name(tname);
        return tr;
    }
    
}
