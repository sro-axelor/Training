package com.hibernate.project.main;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.project.entity.Passenger;
import com.hibernate.project.entity.Train;
import com.hibernate.project.services.Passengerservice;
import com.hibernate.project.services.TrainService;

public class Travel {

	public static void main(String[] args) {
			    
	    TrainService train=new TrainService();
	    
	    Train train1=train.createTrin(1001,"hyd_exp") ;
	    Train train2=train.createTrin(1002,"banglore_exp") ;
		
		List<Train> list=new LinkedList<Train>();
		list.add(train1);
		list.add(train2);
		
		List<Train> list1=new LinkedList<Train>();
		list1.add(train1);
		
		
		Passengerservice png=new Passengerservice();
		Passenger png1=png.createPassenger(1, "sujit");
		
		Passenger png2=png.createPassenger(2, "raja");
		
		
		List<Passenger> passengers=new LinkedList<Passenger>();
		passengers.add(png1);
		passengers.add(png2);
		
		List<Passenger> passengers1=new LinkedList<Passenger>();
		passengers1.add(png2);
		
		train1.setPassengers(passengers);
		train2.setPassengers(passengers1);
		
		png1.setTrain(list);
		png2.setTrain(list1);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Sujit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(train1);
		entityManager.persist(train2);
		entityTransaction.commit();
		
		entityManagerFactory.close();
		entityManager.close();
	}
}
