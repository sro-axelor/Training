package com.hibernate.project.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.project.entity.School;
import com.hibernate.project.entity.Teacher;
import com.hibernate.project.services.Schoolservice;
import com.hibernate.project.services.Teacherservice;

public class Run {
	
	public static void main(String[] args) {
	    
	    Teacherservice tr=new Teacherservice();
		Teacher t1=tr.createTeacher(1, "rahul");
		//Teacher t2=tr.createTeacher(2, "lili");
		
		Schoolservice sh=new Schoolservice();
		School s=sh.CreateSchool(1001, "CHSCHighSchool");
		s.setTr(t1);
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Sujit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(s);
		entityTransaction.commit();
		
		entityManagerFactory.close();
		entityManager.close();
		
		
	}

}
