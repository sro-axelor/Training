package com.hibernate.project.services;

import com.hibernate.project.entity.Passenger;

public class Passengerservice {

    public Passenger createPassenger(int pid, String pname) {
        Passenger png=new Passenger();
        png.setP_id(pid);
        png.setP_name(pname);
        return png;
    }
}
