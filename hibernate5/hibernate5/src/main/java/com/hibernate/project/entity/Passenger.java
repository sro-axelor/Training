package com.hibernate.project.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Passenger {

    @Id
    private int p_id;
    private String p_name;

    @ManyToMany
    @JoinColumn
    private List<Train> train;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public List<Train> getTrain() {
        return train;
    }

    public void setTrain(List<Train> train) {
        this.train = train;
    }

}
