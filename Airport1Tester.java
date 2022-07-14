import java.util.Scanner ;

class AirportTester{

      public static void main(String a[]){
	     
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number of terminals");
		 int size = sc.nextInt();
		 
		 Airport airport = new Airport(size);
		 
		for(int i=0; i<size;i++) {
			
		   TerminalDTO terminal = new TerminalDTO();
		   
		   System.out.println("Enter the id of the terminal");
		   int id = sc.nextInt();
		   System.out.println("Enter the terminal name");
		   String name = sc.next();
		   System.out.println("Enter the no of loading bridges ");
		   int noOfLoadingBridges = sc.nextInt();
		   System.out.println("Enter the depature gates");
		   int noOfDepartureGates = sc.nextInt();
		   System.out.println("Enter the check in counters");
		   int noOfCheckIncounters = sc.nextInt();
		   
		   terminal.setId(id);
		   terminal.setName(name);
		   terminal.setNoOfLoadingBridges(noOfLoadingBridges);
		   terminal.setNoOfDepartureGates(noOfDepartureGates);
		   terminal.setNoOfCheckinCounters(noOfCheckIncounters);
		   
		   airport.createTerminal(terminal);
		 
		 
		 }
		 
		 airport.getTerminalDetails();
	     System.out.println("Enter the Existing id for the Name has to be updated");
	     int existingId = sc.nextInt();
	     System.out.println("Enter the Name to be updated");
	     String updateName = sc.nextLine();
	     lib.updateTerminalNameById(existingId, "NOVEL");    //invoking updateBookNameById method
	     lib.getTerminalsDetails();
	  }

}