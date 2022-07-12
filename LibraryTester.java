import java.util.Scanner;

class LibraryTester{

      public static void main(String args[]){
	  
	      Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter the no of books to be added");
		  int size = sc.nextInt();
		  Library lib = new Library(size);
		
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
		   lib.getBooksDetails();
	  }
}