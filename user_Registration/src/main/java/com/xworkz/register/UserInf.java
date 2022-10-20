package com.xworkz.register;

public interface UserInf {
	
	public void saveUser(UserRegistration user);
	public UserRegistration saveUser(int userId);
	public void deleteUserById(int userId);
	public void loginUser(String email,String password);
	public void updateUser(UserRegistration user);

}

   //HBM2DDL
    //CREATE
   //CASE1: if table is not present in DB, then new table will create
    //Case 2 : if table present in DB , table will drop, then creates new table

     //UPDATE
     //CASE1: TABLE NOT PRESENT, if table not prsent in db, then it will create new table

     //case2: it will update existing table

    //select *from student where email = '' and password = ''---sql

     // jpql = java persitence query language

     //table name -- replace with class name.

    // tale column name --- replace with class property
//note: 
 

