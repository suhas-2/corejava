package com.xworkz.library.dto;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Data
public class BooksDTO {
	
	public BooksDTO(){
		   
    }
	  
	   private int id;
	   private String name;
	   private String author;
	   private String langauge;
	   
	

}
