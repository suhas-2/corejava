package com.xworkz.register;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {
	
	private  EntityManager entityManager;
	
	public EntityManagerUtil() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("userUnit");
		entityManager = entityManagerFactory.createEntityManager(); 
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
}
