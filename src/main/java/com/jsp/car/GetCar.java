package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Disha");
		//entityManager will perform crude operation
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Car car = entityManager.find(Car.class, 14);
		if(car!=null) {
			System.out.println(car.getBrand());
			System.out.println(car.getName());
			System.out.println(car.getId());
		}
		else {
			System.out.println("No  car object found ");
		}
	}

}
