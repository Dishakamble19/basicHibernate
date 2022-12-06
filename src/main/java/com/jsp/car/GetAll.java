package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Disha");
		//entityManager will perform crude operation
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		  Car car = entityManager.find(Car.class ,1); 
		  car.setName("X5");// UPDATE VALUES

			if(car!=null) {
				entityTransaction.begin();
				entityManager.merge(car);
				entityTransaction.commit();
				System.out.println("Value updated");
			}

			else {
				System.out.println("Value updated ");
			}

		  
		  
		  
		  	}
	

}


