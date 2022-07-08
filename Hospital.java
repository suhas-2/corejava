class Hospital{

      //has many patients
	  PatientDTO[] dtos = new PatientDTO[4];
	  
	  //instance variable
	  int index;
	  
	  public Hospital(){
	  
	       System.out.println("hospital const is created");
		   }
		
		public boolean createPatient(PatientDTO dto){
		
		             System.out.println("inside craete patient");
					 boolean isAdded = false;
					 if(dto != null && dto.getName() !=null){
					     this.dtos[index++] = dto;
						isAdded = true;
						System.out.println("patient added succesfully");
						}
					
					else{
					     System.out.println("cannot add patients");
					 }
					 return isAdded;
				 }
			 
			 public void getPatientDetails(){
				 System.out.println("inside patient details");
				 
				 for(int i=0; i<dtos.length;i++)
				 {
					 System.out.println(dtos[i].getId()+"   "+dtos[i].getName()+"  "+dtos[i].getAge()+"  "+dtos[i].getGender()+"   "+dtos[i].getContactNo());
				 
			 }
			 }
}
					
					 
					 