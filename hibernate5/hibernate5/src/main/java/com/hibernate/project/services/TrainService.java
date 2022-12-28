package com.hibernate.project.services;

import com.hibernate.project.entity.Train;

public class TrainService {
    
    public Train createTrin(Integer tid,String tname) {
        Train train=new Train();
        train.setT_id(tid);
        train.setT_name(tname);
        return train;
    }
}