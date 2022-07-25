package com.xworkz.hospital.crud.impl;
import java.util.Arrays;

import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.dto.PatientDTO;



public class HospitalImpl implements Hospital {
	

    //has many patients	
	  PatientDTO[] dtos ;
	  //instance variable
	  int index;
	  
	  public HospitalImpl(int size){
		  
		    dtos = new PatientDTO[size];
	  
	       System.out.println("hospital const is called");
		   }
		@Override
		public boolean createPatient(PatientDTO dto){
		
		             System.out.println("inside craete patient");
					 boolean isAdded = false;
					 if(dto != null && dto.getName() !=null){
					     this.dtos[index++] = dto;
						isAdded = true;
						System.out.println("patient added succesfully");
						}
					
					else{
					     System.out.println("cannot add patients");
					 }
					 return isAdded;
				 }
			 
			 @Override
			 public void getPatientDetails(){
				 System.out.println("inside patient details");
				 
				 for(int i=0; i<dtos.length;i++)
				 {
					  System.out.println(dtos[i]);
				 
			 }
			 }
			 
			@Override
			public boolean updatePatientNameById(int id, String name){
				 System.out.println("inside update patient name");
				 boolean updatedName= false;
				 for(int i=0; i<dtos.length;i++){
					 if(dtos[i].getId()==id){
						
						 dtos[i].setName(name);
						 updatedName=true;
					 }
					 else
					 {
						 System.out.println("please update the patient name first");
					 }
					  }
					 return updatedName;
				
			 }
			 
			 @Override
			  public boolean updatePatientAddressById(int id, String address){
				 System.out.println("inside update patient address");
				 boolean updatedAddress= false;
				 for(int i=0; i<dtos.length;i++){
					 if(dtos[i].getId()==id){
						
						 dtos[i].setAddress(address);
						 updatedAddress=true;
					 }
					 else
					 {
						 System.out.println("please update the patient address first");
					 }
					  }
					 return updatedAddress;
				
			 }
             @Override
			   public boolean deletePatientByName(String name){
				   boolean patientDeleted = false;
				   System.out.println("inside delete patient by name");
				   for(int i=0,j=0; j<dtos.length;j++){
					   if(!dtos[j].getName().equals(name)){
						   
						   
						   dtos[i++] = dtos[j];
						   patientDeleted = true;
						  
						   
					   }
					   dtos = Arrays.copyOf(dtos,i);
				   }
				   return patientDeleted;
				   
			   }
			   @Override
			   public boolean deletePatientByAddress(String address){
				   boolean patientDeleted = false;
				   System.out.println("inside delete patient by adress");
				   for(int i=0,j=0; j<dtos.length;j++){
					   if(!dtos[j].getAddress().equals(address)){
						   
						   
						   dtos[i++] = dtos[j];
						   patientDeleted = true;
						  
						   
					   }
					   else{
						   System.out.println("patient name not found");
					   }
					   dtos = Arrays.copyOf(dtos,i);
				   }
				   return patientDeleted;
				   
			   }

}
