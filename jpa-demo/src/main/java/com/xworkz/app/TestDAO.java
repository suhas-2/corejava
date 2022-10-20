package com.xworkz.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TestDAO {

		public static void main(String[] args) {
		  
			//step 1 create entity object and set the values using setter
			
			Person person = new Person();
			person.setId(102);
			person.setFirstName("Suhas");
			person.setLastName("Achar");
			
			//step 2:its used to create entityManager by reading persistence.xml
			//and it will load all DB and hiberdate properties to entitymanager object.
			
			EntityManagerFactory factoryManager=Persistence.createEntityManagerFactory("Person_xworkz");
			
			//step 3: 
			//EntityManager used to perform CRUD operations
			//EntityManager is interface
			EntityManager entityManager=factoryManager.createEntityManager();
			
			//step 4:
			//EntityTransaction used to perform Transaction management for save/update
			//EntityTransaction should be use only when we are saving or updating object 
			EntityTransaction transaction=entityManager.getTransaction();
			
			transaction.begin();
			
			//step 5:
			//persist method will insert record in table
			entityManager.persist(person); 
			
		/*	Person getPerson = entityManager.find(Person.class,242);
			entityManager.remove(getPerson);
			Person updatePerson = entityManager.find(Person.class,242);
					
					updatePerson.setFirstName("BP");
					entityMan */
			
			//commit method will insert record in table
			transaction.commit();
			entityManager.close();
			factoryManager.close();
			
		}

	}


