package com.hibernate.project.main;

import javax.persistence.*;

import com.hibernate.project.entity.Bike;

public class Find {
        
        public static void main(String[] args) {
            
          EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Sujit");
          EntityManager entityManager=entityManagerFactory.createEntityManager();
          
          Bike bike = entityManager.find(Bike.class,2);
          System.out.println(bike);
          
          entityManager.close();
          entityManagerFactory.close();
      }
}
