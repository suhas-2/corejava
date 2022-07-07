 public class ApartmentDTO{
	
	 //2.rule
	 public ApartmentDTO(){
	 }

    //3. rule 
     private int id;
	 private String name;
	 private String owner;
	 
	
	 //4.rule getter and setter
	 public int getId(){
	   return id;
	   }
	  
	 public String getName()
	 {
	   return name;
	   }
	 public String getOwner()
	 {
	   return owner;
	   }
	  public void setId(int id)
	  {
	    this.id = id;
		}
	public void setName(String name)
	{
	    this.name= name;
		}
	public void setOwner(String owner)
	{
	    this.owner= owner;
		}
		}