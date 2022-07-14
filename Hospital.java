class Hospital{

      //has many patients	
	  PatientDTO[] dtos ;
	  //instance variable
	  int index;
	  
	  public Hospital(int size){
		  
		    dtos = new PatientDTO[size];
	  
	       System.out.println("hospital const is called");
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
					 System.out.println(dtos[i].getId()+"   "+dtos[i].getName()+"  "+dtos[i].getAge()+"    "+dtos[i].getContactNo());
				 
			 }
			 }
			 
			 public boolean updatePatientNameById(int id, String name){
				 System.out.println("inside update patient name");
				 boolean updatedName= false;
				 for(int i=0; i<dtos.length;i++){
					 if(dtos[i].getId()==id){
						
						 dtos[i].setName(name);
						 updatedName=true;
					 }
					 else
					 {
						 System.out.println("please update the patient name first");
					 }
					  }
					 return updatedName;
				
			 }
}
					
					 
					 