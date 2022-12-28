package com.axelor.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Rider {
	public static void main(String[] args) {
		
		Bike bike1=new Bike();
		bike1.setSerialno(1);
		bike1.setBikename("ktm_Rc_200");
		bike1.setBrand("KTM");
		
		Bike bike2=new Bike();
		bike2.setSerialno(2);
		bike2.setBikename("bmw_310");
		bike2.setBrand("BMW");
		
		Bike bike3=new Bike();
		bike3.setSerialno(3);
		bike3.setBikename("classic_350");
		bike3.setBrand("RE");
		
		Bike bike4=new Bike();
		bike4.setSerialno(4);
		bike4.setBikename("apache_200");
		bike4.setBrand("TVS");
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Sujit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
         
		
		entityTransaction.begin();
		
		entityManager.persist(bike1);
		entityManager.persist(bike2);
		entityManager.persist(bike3);
		entityManager.persist(bike4);
		
		entityTransaction.commit();
	}
}
