import java.util.Scanner;

class HospitalTester{
   
   
   public static void main(String a[]){
	   
	      Scanner sc = new Scanner(System.in);
		  
		  System.out.println("enter the no of patients to be added");
		  int size = sc.nextInt();
		  Hospital hos = new Hospital(size);
		  
		  for(int i=0; i<size ;i++){
			  
		 PatientDTO dto = new PatientDTO();
		  
		  System.out.println("enter the patient name");
		  String name = sc.next();
		  
		  System.out.println("enter the patient id");
		  int id = sc.nextInt();
		 
  		 System.out.println("enter the patient contact");
		  long contactNo = sc.nextLong();
		 
		 System.out.println("enter the patient age");
		  int age = sc.nextInt();
		  
		 
		 dto.setGender(Gender.MALE);
		 dto.setId(id);
		 dto.setAge(age);
		 dto.setName(name);
		 dto.setContactNo(contactNo);
		  
		 hos.createPatient(dto);
	   }
	hos.getPatientDetails();
	//Invoking updatePatientNameById method
	System.out.println("enter the Id to be updated");
	int existingId = sc.nextInt();
	
	System.out.println("enter the name to be updated");
	String  updatedName=sc.nextLine();
	
	hos.updatePatientNameById(existingId, updatedName);
	hos.getPatientDetails();
	
   }
 }