class Institute{

static String instName = "PESITM";
       String course;
	   int noOfStaff;
	   long contactNo;
	   String location;
	   
	   public Institute(String iCoarse, long no, int staff, String loc){
	   
	   course = iCoarse;
	   noOfStaff = staff;
	   noOfStaff = staff;
	   location = loc;
	   contactNo = no;
	   
	   
	   }
	   
	   public static void main(String a[]){
		   
		   System.out.println("Institute Name is " +Institute.instName);

	   Institute inst = new Institute("Engineering",8147901522l, 70,"Shimoga");
	   System.out.println(inst.course+" "+inst.contactNo+"  "+inst.noOfStaff+"  "+inst.location);
	   
	   Institute inst1 = new Institute("Management Studies",948316671l, 50 , "Badravathi");
	   System.out.println(inst1.course+"  "+inst1.contactNo+"  "+inst1.noOfStaff+"  "+inst1.location);
	   
	   
	   }
	   }
	   