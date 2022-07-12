import java.util.Scanner;

class Airport1Tester{
	
	   public static void main(String a[]){
	     
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Number of terminals");
		 int size = sc.nextInt();
		 
		 Airport1 airport = new Airport1(size);
		 
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
	  
	  }


}