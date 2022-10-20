package com.xworkz.register;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UserDao {

	public static void main(String[] args) {
		
		UserRegistration user = new UserRegistration();
		
		
		user.setName("SUNIL");
		user.setAge(24);
		user.setEmail("sunil.xworkz@gmail.com");
		//yyyy-mm-dd
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		
		Date dob;
		 
		    try {
				dob = dateFormat.parse("1997-11-14");
				user.setDob(dob);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    //password encoding
		    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		    user.setPassword(encoder.encode("Sunil1289"));
		
		    UserService userService = new UserService();
		  // userService.saveUser(user);
		    
		    System.out.println("=========Find by Email=========");
		    
		   UserRegistration user1 = userService.findByUserEmail("sunil.xworkz@gmail.com");
		   
		   System.out.println("User Details" +user1.toString());
		
		
		}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
