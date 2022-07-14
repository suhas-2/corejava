public class PatientDTO{

      public PatientDTO(){
	  
	  }
	  
	  private int id;
	  private String name;
	  private int age;
	  private Gender gender;
	  private long contactNo;
	  
	  public int getId(){
	  
	      return id;
		  }
	  public String getName(){
	  
	      return name;
		  }
	  public int getAge(){
	       return age;
		   }
	   public long getContactNo(){
	        return contactNo;
			}
			public Gender getGender(){
				return gender;
			}
		public void setId(int id){
		      this.id = id;
			  }
		  public void setName(String name){
		      this.name = name;
			  }
		  public void setAge(int age){
		      this.age =age;
			  }
		  public void setContactNo(long contactNo){
		      this.contactNo= contactNo;
			  }
		  public void setGender(Gender gender){
		   this.gender = gender;
			  }
}
			  

     