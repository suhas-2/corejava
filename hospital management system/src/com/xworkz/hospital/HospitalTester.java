package com.xworkz.hospital;

import java.util.Scanner;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		  
		  System.out.println("enter the no of patients to be added");
		  int size = sc.nextInt();
		  HospitalImpl hos = new HospitalImpl(size);
		  
		  for(int i=0; i<size ;i++){
			  
		 PatientDTO dto = new PatientDTO();
		  
		  System.out.println("enter the patient name");
		  String name = sc.next();
		  
		  System.out.println("enter the patient id");
		  int id = sc.nextInt();
		 
 		 System.out.println("enter the patient contact");
		  long contactNo = sc.nextLong();
		 
		 System.out.println("enter the patient age");
		  int age = sc.nextInt();
		  
		  System.out.println("enter the patient address");
		  String address = sc.next();
		  
		  System.out.println("enter the patient gender");
		  String gender = sc.next();
		  
		  dto.setGender(Gender.valueOf(gender));
		 dto.setId(id);
		 dto.setAge(age);
		 dto.setName(name);
		 dto.setContactNo(contactNo);
		 dto.setAddress(address);
		  
		 hos.createPatient(dto);
	   }
	   String option = null;
	   do{
		   
		    System.out.println("Enter 1 to fetch all the patients");
			System.out.println("Enter 2 to update patients Address");
			System.out.println("Enter 3 to update patients name");
			System.out.println("Enter 4 to delete patient details by id");
			System.out.println("Enter the choice no");
			
			int choise = sc.nextInt();
			
			switch(choise){
				
				case 1 : hos.getPatientDetails();
				         break;
				
				case 2 : //invoking updatePatientAddressById
				         System.out.println("enter the existing id for address has to be updated");
						 int existingID = sc.nextInt();
						 
						 System.out.println("enter the address to be updated");
						 String updatedAddress = sc.next();
						 break;
						 
				case 3 :  //invoking updatePatientNameById
				         System.out.println("enter the existing id for name has to be updated");
						 int existingId= sc.nextInt();
						 
						 System.out.println("enter the name to be updated");
						 String updatedName = sc.next();
						 hos.updatePatientNameById(existingId, updatedName);
						 break;
						 
				case 4 :System.out.println("enter the  name to be deleted");
							String name1 = sc.next();
							
							hos.deletePatientByName(name1);
							break;
							
				case 5:
							System.out.println("enter the  get the name of patient by id ");
							int id= sc.nextInt();
							System.out.println("enter the get name ");
							String getPatientNameById=sc.next();
							break; 
						
			     default : System.out.println("Given the choice cannot to be deleiverd");
				            break;
							
			}
			
			System.out.println("do you want to continue Y/N");
            option = sc.next();
	   }
  
      while (option.equals("Y"));
	}

	}


