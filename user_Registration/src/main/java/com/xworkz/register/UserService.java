package com.xworkz.register;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class UserService implements UserInf {
	
	 EntityManagerUtil  entityManagerUtil = new EntityManagerUtil();

	@Override
	public void saveUser(UserRegistration user) {
		
		EntityTransaction entityTransaction = entityManagerUtil.getEntityManager().getTransaction(); 
		entityTransaction.begin();
		
		entityManagerUtil.getEntityManager().persist(user);
		
		entityTransaction.commit();
		entityManagerUtil.getEntityManager().close();
	}

	@Override
	public UserRegistration saveUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginUser(String email, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(UserRegistration user) {
		// TODO Auto-generated method stub
		
	}

	public UserRegistration findByUserEmail(String email) {
		
		Query query = entityManagerUtil.getEntityManager().createNamedQuery("findByEamil");
		//setting parameter for jpql query
		query.setParameter("email", email);
		//for encryption of password
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		//query.setParameter("password", password);
		
		List<UserRegistration>  listUser= query.getResultList();
       
		entityManagerUtil.getEntityManager().close();
		
		System.out.println("====count of list======="+listUser.size());
		
		UserRegistration retUser = null;
		
		for( UserRegistration user : listUser) {
			System.out.println("id---"+user.getId());
			retUser= user;
			
		}
		return retUser;
	}


}
