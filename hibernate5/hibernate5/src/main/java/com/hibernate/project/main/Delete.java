package com.hibernate.project.main;

import javax.persistence.*;

import com.hibernate.project.entity.Bike;

public class Delete {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Sujit");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();
        
        Bike b=entityManager.find(Bike.class,2);
        entityTransaction.begin();
        entityManager.remove(b);
        entityTransaction.commit();
        
    }
}
