package com.axelor.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Findindex {
	
	  public static void main(String[] args) {
		  
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Sujit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Bike bike=entityManager.find(Bike.class,2);
		System.out.println(bike);
	}
}
