class Cosmetic{

      int id;
     String brand;
	 String type;
	 int price;
	 long manufacturingDate;
	 long expiryDate;
	
public static void main(String a[])
{

      Cosmetic cosmetic = new Cosmetic();
	   cosmetic.id = 123;
	   cosmetic.brand= "Lakme";
	   cosmetic.type = "Bath Preparation";
	   cosmetic.price= 825;
	   cosmetic.manufacturingDate = 8-05-24;
	   cosmetic.expiryDate = 07-05-23;
	   
	   System.out.println("id of costomer is " +cosmetic.id);
	   System.out.println("the brand of cosmetic is " +cosmetic.brand);
	   System.out.println("the type of cosmetic is " +cosmetic.type);
	   System.out.println("the price of cosmetic is " +cosmetic.price);
	   System.out.println("the manufacture date of cosmetic is " +cosmetic.manufacturingDate);
	   System.out.println("the expiry date of cosmetic is " +cosmetic.expiryDate);
	   System.out.println("==========================================");
	   
	   Cosmetic cosmetic1 = new Cosmetic();
	   cosmetic1.id = 124;
	   cosmetic1.brand = "Loreal";
	   cosmetic1.type = "Powder";
	   cosmetic1.price = 456;
	   cosmetic1.manufacturingDate = 12-02-20;
	   cosmetic1.expiryDate = 23-07-21;
	   
	   System.out.println("id of costomer is " +cosmetic1.id);
	   System.out.println("the brand of cosmetic is " +cosmetic1.brand);
	   System.out.println("the price of cosmetic is " +cosmetic1.price);
	   System.out.println("the type of cosmetic is " +cosmetic.type);
	   System.out.println("the manufacture date of cosmetic is " +cosmetic1.manufacturingDate);
	   System.out.println("the expiry date of cosmetic is " +cosmetic1.expiryDate);
	   
	   
	  
}


}