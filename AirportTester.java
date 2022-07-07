public class AirportTester{

   public static void main(String a[]){
   
         AirportDTO air = new AirportDTO();
		 
		 air.setId(23);
		 air.setName("Delhi airport");
		 air.setNo(8147901522l);
		 
		 System.out.println("airport id is: " +air.getId());
		 System.out.println("airport name is: " +air.getName());
		 System.out.println("airport contact no is: " +air.getNo());
		 }
		 }