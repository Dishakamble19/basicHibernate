package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriver {
	public static void main (String[]args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Disha");
		//entityManager will perform crude operation
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Car car =new Car();
		car.setId(5);
		car.setBrand("Ertiga");
		car.setName("Maruti Suzuki");
		
		
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		System.out.println("all good");
	}

			

}