class Mobile{

  String brand;
  int modelNo;
  String colour;
  String processorName ;
  int price; 
  String ram ;
  String rom;
  
  public static void main(String a[]){
  
  Mobile mobile = new Mobile();
  mobile.brand = "Samsung";
  mobile.modelNo = 1254;
  mobile.processorName = "Mediatek";
  mobile.price = 9999;
  mobile.ram =  "4gb";
  mobile.rom = "64gb";
  
  
	   System.out.println("the brand of mobile is " +mobile.brand);
	   System.out.println("the model no of mobile is " +mobile.modelNo);
	   System.out.println("the processor of mobile is " +mobile.processorName);
	   System.out.println("price of mobile is " +mobile.price);
	   System.out.println("ram of mobile is " +mobile.ram);
	   System.out.println("rom of mobile is " +mobile.rom);
	   System.out.println("===========================");
	   
	   
	    Mobile mobile1 = new Mobile();
  mobile1.brand = "VIVO";
  mobile1.modelNo = 1365;
  mobile1.processorName = "SnapDragon";
  mobile1.price = 14999;
  mobile1.ram =  "6gb";
  mobile1.rom = "128gb";
  
  System.out.println("the brand of mobile is " +mobile1.brand);
	   System.out.println("the model no of mobile is " +mobile1.modelNo);
	   System.out.println("the processor of mobile is " +mobile1.processorName);
	   System.out.println("price of mobile is " +mobile1.price);
	   System.out.println("ram of mobile is " +mobile1.ram);
	   System.out.println("rom of mobile is " +mobile1.rom);
  
  
	   }
	   }
	   
  
  
  