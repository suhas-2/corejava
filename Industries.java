class Industries{

static String indName = "SANSERA group of Industry";
       String ownerName;
	   String indType;
	   int noOfWorkers;
	   String location;
	   
	   public Industries(String oName, String type, int workers, String loc){
	   
	   ownerName = oName;
	   indType = type;
	   noOfWorkers = workers;
	   location = loc;
	   }
	   
	   public static void main(String a[]){
		   
		   System.out.println("Industry Name is " +Industries.indName);

	   Industries ind = new Industries("Shekar vasan","Mid-Scale", 100,"Bommsandra");
	   System.out.println(ind.ownerName+" "+ind.indType+"  "+ind.noOfWorkers+"  "+ind.location);
	   
	   Industries ind1 = new Industries("F.R Singhvi","Large-Scale", 200 , "Jigini");
	   System.out.println(ind1.ownerName+"  "+ind1.indType+"  "+ind1.noOfWorkers+"  "+ind1.location);
	   
	   
	   }
	   }
	   