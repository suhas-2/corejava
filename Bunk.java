class Bunk{

static String bunkName = "Indian OIL";
static int petrolRate = 100;
static int dieselRate = 110;
       String ownerName;
	   String type;
	   int noOfWorkers;
	   String location;
	   
	   public Bunk(){
		   System.out.println("object is created");
	   }
	  
	   public Bunk(String ownerName, String type, int noOfWorkers, String location){
		   this();
		  
	   this.ownerName = ownerName;
	   this.type = type;
	   this.noOfWorkers = noOfWorkers;
	   this.location = location;
	   }
	   
	   public static void main(String a[]){
		   
		   System.out.println("Bunk Name is " + Bunk.bunkName +  " petrol rate-- " + Bunk.petrolRate + " diesel rate-- " + Bunk.dieselRate);

	   Bunk bunk = new Bunk("Gajendra","PETROL", 20 ,"Rajajinagar");
	   System.out.println(bunk.ownerName+" "+bunk.type+"  "+bunk.noOfWorkers+"  "+bunk.location);
	   
	   Bunk bunk1 = new Bunk("Rajesh","Diesel", 15 , "Huskur Gate");
	   System.out.println(bunk1.ownerName+"  "+bunk1.type+"  "+bunk1.noOfWorkers+"  "+bunk1.location);
	   
	   
	   }
	   }
	   
