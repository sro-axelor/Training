package com.hibernate.project.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student1 {
	@Id
	private int s1_id;
	private String s1_name;
	
	@OneToMany(cascade = CascadeType.ALL )  
	private List <Book1> bk1;

	public Student1() {
		super();
	}

	public Student1(int s1_id, String s1_name, List<Book1> bk1) {
		super();
		this.s1_id = s1_id;
		this.s1_name = s1_name;
		this.bk1 = bk1;
	}

	public int getS1_id() {
		return s1_id;
	}

	public void setS1_id(int s1_id) {
		this.s1_id = s1_id;
	}

	public String getS1_name() {
		return s1_name;
	}

	public void setS1_name(String s1_name) {
		this.s1_name = s1_name;
	}

	public List<Book1> getBk1() {
		return bk1;
	}

	public void setBk1(List<Book1> bk1) {
		this.bk1 = bk1;
	}


	
	

}
