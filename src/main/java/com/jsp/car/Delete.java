package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Disha");
				//entityManager will perform crude operation
				EntityManager entityManager=entityManagerFactory.createEntityManager();
				EntityTransaction entityTransaction=entityManager.getTransaction();
	             Car car = entityManager.find(Car.class ,1);

				if(car!=null) {
					entityTransaction.begin();
					entityManager.remove(car);
					entityTransaction.commit();
					System.out.println("Object with above id deleted");
				}

				else {
					System.out.println("No  car object found ");
				}
	}
}
