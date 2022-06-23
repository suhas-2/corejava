class Cosmetic{

      int id;
     static String brand = "nivia";
	 String type;
	 int price;
	 long manufacturingDate;
	 long expiryDate;
	
	
	public Cosmetic(){
		System.out.println("object is created");
	}
	
      public Cosmetic(int id,String type,int price,long manufacturingDate,long expiryDate){
	  this();
	  this.id = id;
	  this.type = type;
	  this.price = price;
	  this.manufacturingDate = manufacturingDate;
	  this.expiryDate = expiryDate;
	  }
	  public static void main(String a[])
	  {
		  
		  
	      System.out.println("Cosmetic brand is "+Cosmetic.brand);  
		  
		  
		  Cosmetic cosmetic = new Cosmetic(135,"bath preapration",825,80524,070523);
		  System.out.println(cosmetic.id+" type-> "+cosmetic.type+" price is "+cosmetic.price+" man date is "+cosmetic.manufacturingDate+" expiry date is "+cosmetic.expiryDate);
		  
		  
		  Cosmetic cosmetic1 = new Cosmetic(178,"powder",500,120220,230721);
		  System.out.println(cosmetic1.id+" type--> "+cosmetic1.type+" price is "+cosmetic1.price+" man date is "+cosmetic1.manufacturingDate+" expiry date is "+cosmetic1.expiryDate);
	  
	  
	   
}
}