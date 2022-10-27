package com.axelor.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class FindAllData 
{
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Sujit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		List<Bike> b= (List<Bike>) entityManager.createQuery("select b from Bike b").getResultList();
		for(Bike bike:b)
		{
			System.out.println(bike);
		}
		
	}

}
