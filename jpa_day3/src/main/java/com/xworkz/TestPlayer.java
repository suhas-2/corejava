package com.xworkz;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player pyr = new Player();
		//person.setId(102);
		//pyr.setPly_name("Sunil");
		//pyr.setPly_game("Swimming");
		
		
		
		EntityManagerFactory factoryManager=Persistence.createEntityManagerFactory("Player_xworkz");
		
	
		EntityManager entityManager=factoryManager.createEntityManager();
		
		 
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		
		
		
		//entityManager.persist(pyr); 
		
		//Player pyr2 = entityManager.find(Player.class,2);  //for finding the data
		
		//pyr2.setPly_game("Snooker");    // for updating the data
		
		//deleting record using remove method
		//for deleting record in table
		//first we need find the record by using find by passing primary key id
		
		//Player removeclm = entityManager.find(Player.class, 152);
		
		//entityManager.remove(removeclm);
		
	
		transaction.commit();
		entityManager.close();
		factoryManager.close();
		
		getAllPlayer();
		
		getPlayerName();
		
		//System.out.println("==========Player Info========" +pyr2);

	}
	
	public static void getAllPlayer() {
		
		EntityManagerFactory factoryManager=Persistence.createEntityManagerFactory("Player_xworkz");
		
		
		EntityManager entityManager=factoryManager.createEntityManager();
		
	    EntityTransaction transaction=entityManager.getTransaction();
		
		//transaction.begin();
		
		//Query (it is interface)
				//query object holds information
		//was returned by jpa query
		//query object is like result set in jdbc
		//query will return class object which is passed in query
				Query query = entityManager.createQuery("from Player");
				query.getResultList().forEach(e->{
					
					System.out.println("pyr:" +e.toString());
				});
				
				//transaction.commit();
				entityManager.close();
				factoryManager.close();
		
	}
	
	   public static void getPlayerName() {
		   
		   EntityManagerFactory factoryManager=Persistence.createEntityManagerFactory("Player_xworkz");
			
			
			EntityManager entityManager=factoryManager.createEntityManager();
			
		    EntityTransaction transaction=entityManager.getTransaction();
			
			//transaction.begin();
			
			//Query (it is interface)
					//query object holds information
			//was returned by jpa query
			//query object is like result set in jdbc
			//query will return class object which is passed in query
					Query query = entityManager.createQuery("select a.ply_name from Player a");  //a-->aliyas
					query.getResultList().forEach(e->{
						
						System.out.println("pyr ply_name:" +e.toString());
					});
					
					
					entityManager.close();
					factoryManager.close();
		   
	   }

}

   //jpa?
   // types of generators?
    //stages of entity life cycle  --- new,detached,transist,removal

     //unique= true for unique values
