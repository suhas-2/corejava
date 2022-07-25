package com.xworkz.library.crud.impl;

import java.util.Arrays;

import com.xworkz.library.crud.Library;
import com.xworkz.library.dto.BooksDTO;



public class LibraryImpl implements Library {
	
	BooksDTO [] dtos ;
	 
	 int index;
	 
	 public LibraryImpl(int size){

            dtos = new BooksDTO[size];
			 System.out.println("constructor is called");
			 }
		
	  @Override		
	  public boolean createBooks(BooksDTO dto){
	       
		   System.out.print("inside create books");
		   boolean isAdded=false;
		   if(dto !=null && dto.getName() !=null){
		         this.dtos[index++]=dto;
				 isAdded=true;
				 System.out.println("Book added succesfully");
				 }
				 else
				 {
				  System.out.println("Book cannot be added");
				  }
				 return isAdded;
			
			}
			@Override
			 public void getBooksDetails(){
			 
			    System.out.println("inside book details");
				
				 for(int i=0 ; i<dtos.length;i++){
				   
					 System.out.println(dtos[i]);

					}
			}
			
			@Override
			public boolean updateBookNameById(int id, String name){
				 System.out.println("inside update book name");
				 boolean updatedName= false;
				 for(int i=0; i<dtos.length;i++){
					 if(dtos[i].getId()==id){
						
						 dtos[i].setName(name);
						 updatedName=true;
					 }
					 else
					 {
						 System.out.println("please update the book first");
					 }
					  }
					 return updatedName;
	}
		@Override
		public boolean updateLangaugeById(int id, String langauge){
				 System.out.println("inside update book langauge");
				 boolean updatedLangauge= false;
				 for(int i=0; i<dtos.length;i++){
					 if(dtos[i].getId()==id){
						
						 dtos[i].setLangauge(langauge);
						 updatedLangauge=true;
					 }
					 else
					 {
						 System.out.println("please update the book Langauge first");
					 }
					  }
					 return updatedLangauge;
	}
	
	@Override
	 public boolean deleteBookByName(String name){
				   boolean bookDeleted = false;
				   System.out.println("inside delete  by name");
				   for(int i=0,j=0; j<dtos.length;j++){
					   if(!dtos[j].getName().equals(name)){
						   
						   
						   dtos[i++] = dtos[j];
						   bookDeleted = true;
						  
						   
					   }
					   dtos = Arrays.copyOf(dtos,i);
				   }
				   return bookDeleted;
}

}
