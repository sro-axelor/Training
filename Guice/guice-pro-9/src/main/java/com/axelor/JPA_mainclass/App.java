package com.axelor.JPA_mainclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.axelor.JPA_StudentClasses.Student;


public class App {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sujit");
		EntityManager em = emf.createEntityManager();
		
		Student stu = em.find(Student.class,2);
		
		System.out.println(stu);
		
	}
}
