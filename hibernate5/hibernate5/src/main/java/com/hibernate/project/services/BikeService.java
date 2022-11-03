package com.hibernate.project.services;

import com.hibernate.project.entity.Bike;

public class BikeService {
    
    public Bike createBike(Integer no, String bikeName, String bikeBrand) {
        Bike bike= new Bike();
        bike.setSerialno(no);
        bike.setBikename(bikeName);
        bike.setBrand(bikeBrand);
        return bike;
        
    }
}