package com.axelor.JPA_mainclass;

//import java.io.FileNotFoundException;
//import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//import javax.transaction.Transactional;
//import com.google.inject.persist.Transactional;
import com.axelor.JPA_StudentClasses.Student;

public class App {
	
//	@Transactional(rollbackOn = IOException.class)
//	public void HomeWork() throws IOException {
//	      
//	}

//	@Transactional(rollbackOn = IOException.class, ignore = FileNotFoundException.class)
//	public void HomeWork() throws IOException , FileNotFoundException {
//	      
//	}
	
	public static void main(String[] args) {

		Student stu = new Student();
		stu.setSid(10);
		stu.setSname("bheem");
		stu.setMark(95);

//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sujit");
//		EntityManager em = emf.createEntityManager();

//		Student stu = em.find(Student.class,2);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sujit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		em.persist(stu);

		et.commit();

		emf.close();
		em.close();
		System.out.println(stu);

	}
}
