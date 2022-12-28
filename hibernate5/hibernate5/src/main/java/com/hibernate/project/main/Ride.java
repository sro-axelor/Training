package com.hibernate.project.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.project.entity.Bike;
import com.hibernate.project.services.BikeService;

public class Ride {
    
    public static void main(String[] args) {
        
       BikeService bike = new BikeService();
       
       Bike bike1 = bike.createBike(1, "bmw_310", "BMW");
       
       Bike bike2 = bike.createBike(2, "classic_350", "RE");
       
        
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Sujit");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
         
        
        entityTransaction.begin();
        
        entityManager.persist(bike1);
        entityManager.persist(bike2);
        
        entityTransaction.commit();
    }

}
