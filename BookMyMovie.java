class BookMyMovie{

String movies[] = {"om","jogi","gaja","appu","dangal","falak","h20"};
int noOfTickets;
static int ticketPrice=600;
String theatreName;
String movieName;
int totalNoOfTickets ;
int totalTicketPrice;


String snacks[] = {"chips","popcorn","gobi","sweetcorn"};
static int totalSnacksPrice = 100;
String snackName;
int quantity;
int seatNo;
int totalNoOfSnacks;
int totalSnacks;


public BookMyMovie(String theatreName, int noOfTickets,String movieName,String snackName, int quantity,int seatNo){
System.out.println("BookMyMovie object is created");	
    this.theatreName = theatreName;
	this.totalNoOfTickets = totalNoOfTickets;
	this.movieName  = movieName;
	this.movieName = movieName;
	
	this.snackName = snackName;
	this.quantity = quantity;
	this.seatNo = seatNo;
   
   
   }
   public int showTime(int noOfTickets,String bookedBy , String movieName){
	   int totalTicketPrice=0;
   System.out.println("inside showTime()......");
   System.out.println("Arg 1 : No of tickets "+noOfTickets);
   System.out.println("Arg 2 : Booked by "+bookedBy);	
   System.out.println("Arg 3 : Movie Name "+movieName);
   
   for(int i = 0 ; i < movies.length ; i++){
   
   if(movieName == movies[i]){
   System.out.println("Movie name matched");
   
   if(noOfTickets < totalNoOfTickets){
   totalTicketPrice = noOfTickets*ticketPrice;
   totalNoOfTickets = totalNoOfTickets - noOfTickets;
   System.out.println("For Movie :"+movieName+" No of ticket are that are remaining: "+totalNoOfTickets+" total PRICE is "+totalTicketPrice);
   }
   else{
             System.out.println("ist ticket illa....");
   }
   }
   else{
      System.out.println("Movies not available");
   }
   }
   return totalTicketPrice;
   }
   
   public int buySnacks(String snackName, int quantity, int bookedSeatNo){
	   int totalSnacksPrice=0;
	   System.out.println("ARG1: Name of snack "+snackName);
	   System.out.println("ARG2: quantity of snack "+quantity);
	    System.out.println("ARG3: booked by seat no "+bookedSeatNo);
		
		for(int i=0; i<snacks.length;i++){
			if(snackName== snacks[i])
			{
				System.out.println("snack name is matched");
				
				if(quantity<totalNoOfSnacks){
                         totalSnacksPrice = quantity * totalSnacksPrice;
                          totalNoOfSnacks = totalNoOfSnacks - quantity;
						  System.out.println("for snacks: "+ quantity+"snacks remaining "+ totalNoOfSnacks+" total price is "+totalTicketPrice);
				}
				else {
					System.out.println("snacks kaali aagide");
				}
			}
			else{
				System.out.println("snacks not available");
			}
   }
   return totalSnacksPrice;
   }
}
   
				
                          						  
				
				

   