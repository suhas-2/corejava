public class BooksDTO{

   public BooksDTO(){
   
       }
	   private int id;
	   private String name;
	   private String author;
	   private String langauge;
	   
	   public int getId(){
	     return id;
		 }
	 public String getName(){
	    return name;
		}
	public String getAuthor(){
	   return author;
	   }
	  public String getLangauge(){
	  return langauge;
	  }
	  public void setId(int id){
	     this.id=id;
		 }
	 public void setName(String name){
	      this.name = name;
		  }
	  public void setAuthor(String author){
	      this.author = author;
		  }
	  public void setLangauge(String langauge){
	      this.langauge=langauge;
		  }
	  }