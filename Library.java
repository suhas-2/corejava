class Library{
 
     BooksDTO [] dtos ;
	 
	 int index;
	 
	 public Library(int size){

             dtos = new BooksDTO[size];
			 System.out.println("constructor is called");
			 }
			 
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
			 public void getBooksDetails(){
			 
			    System.out.println("inside book details");
				
				 for(int i=0 ; i<dtos.length;i++){
				   
				    System.out.println(dtos[i].getId()+"   "+dtos[i].getName()+"    "+dtos[i].getAuthor()+"   "+dtos[i].getLangauge());
					}
			}
	}
           	 