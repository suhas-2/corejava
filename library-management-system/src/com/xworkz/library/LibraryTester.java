package com.xworkz.library;
import java.util.Arrays;
import java.util.Scanner;

import com.xworkz.library.crud.Library;
import com.xworkz.library.crud.impl.LibraryImpl;
import com.xworkz.library.dto.BooksDTO;

public class LibraryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc = new Scanner(System.in);
			  
			  System.out.println("Enter the no of books to be added");
			  int size = sc.nextInt();
			  Library lib = new  LibraryImpl(size);
			
			   for(int i=0; i<size ;i++){
			   
		      BooksDTO dto = new BooksDTO();
			  
			  System.out.println("Enter the book id");
			  int id = sc.nextInt();
			 
			 System.out.println("Enter the book name");
			  String name = sc.next();
			 
			 System.out.println("Enter the author name");
			  String author = sc.next();
			 
			 System.out.println("Enter the langauge of book");
			  String langauge=sc.next();
			  
			  
			  dto.setId(id);
			  dto.setName(name);
			  dto.setAuthor(author);
			  dto.setLangauge(langauge);
			  
			 lib.createBooks(dto);
			   }
			   String option = null;
		   do{
			   
			    System.out.println("Enter 1 to fetch all the books");
				System.out.println("Enter 2 to update book name");
				System.out.println("Enter 3 to update book langauge");
				System.out.println("Enter 4 to delete book name by id");
				System.out.println("Enter the choice no");
				
				int choise = sc.nextInt();
			   
			   switch(choise)
					{
						case 1:	lib.getBooksDetails();
								break;
						case 2://invoking updateBookNameById method
								System.out.println("enter the existing ID for book name has to be updated");
								int existingID =  sc.nextInt();
								
								System.out.println("enter the book name to be updated");
								String updatedName = sc.next();
								lib.getBooksDetails();
								break;
						
						case 3://invoking updateLangaugeById method
								System.out.println("enter the existing id for Langauge has to be Updeted");
								 int existingId = sc.nextInt();
								
								System.out.println("enter the Langauge to be updated");
								String updatedLangauge =sc.next();   
								
								lib.updateLangaugeById(existingId,updatedLangauge);
								break;
								
						case 4:
								System.out.println("enter the  name to be deleted");
								String name1 = sc.next();
								
								lib.deleteBookByName(name1);
								break;
						
						case 5:
								System.out.println("enter the  get the name of patient by id ");
								int id= sc.nextInt();
								System.out.println("enter the get name ");
								String getBookNameByID=sc.next();
								break; 
					   
					   default: System.out.println("Given the choise cannot be delivered");
								break;
					}
					
					System.out.println("Do you want to continue Y/N");
				   option = sc.next();
				}while(option.equals("Y"));
				
			   
			 

		  }

	}

