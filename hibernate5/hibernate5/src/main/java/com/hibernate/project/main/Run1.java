package com.hibernate.project.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.project.entity.Book1;
import com.hibernate.project.entity.Student1;
import com.hibernate.project.services.Bookservice;
import com.hibernate.project.services.StudentService;

public class Run1 {
	
	public static void main(String[] args) {
	
		
		Bookservice bk=new Bookservice();
		Book1 b1=bk.createBook(101,"math");
		Book1 b2=bk.createBook(201,"English");
		
		List<Book1> list=new ArrayList<Book1>();
		list.add(b1);
		list.add(b2);
		
		
		StudentService stu=new StudentService();
        Student1 stud1=stu.createStudent1(1, "sujit");
		stud1.setBk1(list);
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Sujit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(stud1);
		entityTransaction.commit();
		
		entityManagerFactory.close();
		entityManager.close();
		
	}
}
