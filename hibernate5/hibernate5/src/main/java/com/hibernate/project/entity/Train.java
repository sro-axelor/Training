package com.hibernate.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Train {

	@Id
	private int T_id;
	private String T_name;
	
	@ManyToMany(cascade = CascadeType.ALL , mappedBy = "train")
	private List<Passenger> passengers;

	public int getT_id() {
		return T_id;
	}

	public void setT_id(int t_id) {
		T_id = t_id;
	}

	public String getT_name() {
		return T_name;
	}

	public void setT_name(String t_name) {
		T_name = t_name;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
}
