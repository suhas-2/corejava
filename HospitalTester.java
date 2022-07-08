class HospitalTester{
   
   
   public static void main(String a[]){
   
   
         Hospital hos = new Hospital();
		 
		 PatientDTO dto = new PatientDTO();
		 
		 dto.setGender(Gender.MALE);
		 dto.setId(3);
		 dto.setAge(24);
		 dto.setName("suhas");
		 dto.setContactNo(814526262);
		 
		 PatientDTO dto1 = new PatientDTO();
		 
		 dto1.setGender(Gender.female);
		 dto1.setId(4);
		 dto1.setAge(23);
		 dto1.setName("ganesh");
		 dto1.setContactNo(8155555555l);
		 
		 PatientDTO dto2 = new PatientDTO();
		 
		 dto2.setGender(Gender.transgender);
		 dto2.setId(5);
		 dto2.setAge(21);
		 dto2.setName("jaali");
		 dto2.setContactNo(777777777l);
		 
		 PatientDTO dto3 = new PatientDTO();
		 
		 dto3.setGender(Gender.MALE);
		 dto3.setId(6);
		 dto3.setAge(20);
		 dto3.setName("RAAMA");
		 dto3.setContactNo(88888888888l);
		 
		 
		 hos.createPatient(dto);
		 hos.createPatient(dto1);
		 hos.createPatient(dto2);
		 hos.createPatient(dto3);
		 hos.getPatientDetails();
		 }
	 }