package com.hibernate.project.main;

import javax.persistence.*;

import com.hibernate.project.entity.Bike;

public class Update {
    
    public static void main(String[] args) {

        Bike b = new Bike(4,"R15","YAMAHA");
        
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Sujit");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        
        entityTransaction.begin();
        entityManager.merge(b);
        entityTransaction.commit();
        
        entityManagerFactory.close();
        entityManager.close();
        
    }

}
