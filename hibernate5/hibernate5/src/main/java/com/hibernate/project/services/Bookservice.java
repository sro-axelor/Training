package com.hibernate.project.services;


import com.hibernate.project.entity.Book1;

public class Bookservice {

    public Book1 createBook(Integer bid,String bname) {
        
        Book1 bk=new Book1();
        bk.setB1_id(bid);
        bk.setB1_name(bname);
        return bk;
    }
    
}
