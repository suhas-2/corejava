import java.util.Scanner;

class CustomerTester{
	
	 public static void main(String args[]){
		 
		 Scanner sc = new Scanner(System.in);
		 
		   System.out.println("Enter no of order");
			    int size = sc.nextInt();
				
			Customer cus = new Customer(size);

            for (int i=0; i<size ;i++){
				OrderDTO dto = new OrderDTO();
				
		  System.out.println("Enter order ID");
		    int id = sc.nextInt();
		  System.out.println("Enter orderer Name");
            String name = sc.next(); 
          System.out.println("Enter ordered date ");
            String orderedDate = sc.next();	
		  System.out.println("Enter order Address");
		    String address = sc.next();
			
		  dto.setId(id);
          dto.setName(name);
          dto.setOrderedDate(orderedDate);
          dto.setAddress(address);		
       
          cus.creatOrder(dto);	   
			}			
			
			cus.getOrder();
	 }
}
