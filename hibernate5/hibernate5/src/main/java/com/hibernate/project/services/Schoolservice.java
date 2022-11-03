package com.hibernate.project.services;

import com.hibernate.project.entity.School;

public class Schoolservice {
    
    public School CreateSchool(Integer sid,String sname) {
        
        School sh=new School();
        sh.setS_no(sid);
        sh.setS_name(sname);
        return sh;
    }

}
