class Institute{

static String instName = "PESITM";
       String course;
	   int noOfStaff;
	   long contactNo;
	   String location;
	   
	   public Institute(){
		   System.out.println("object is created");
	   }
	   
	   public Institute(String course, long contactNo, int noOfStaff, String location){
		       this();
		 
	   this.course = course;
	 this.contactNo = contactNo;
	   this.noOfStaff = noOfStaff;
	   this.location = location;
	   
	   
	   }
	   
	   public static void main(String a[]){
		   
		   System.out.println("Institute Name is " +Institute.instName);

	   Institute inst = new Institute("Engineering",8147901522l, 70,"Shimoga");
	   System.out.println(inst.course+" "+inst.contactNo+"  "+inst.noOfStaff+"  "+inst.location);
	   
	   Institute inst1 = new Institute("Management Studies",948316671l, 50 , "Badravathi");
	   System.out.println(inst1.course+"  "+inst1.contactNo+"  "+inst1.noOfStaff+"  "+inst1.location);
	   
	   
	   }
	   }
	   