package DAO;

public class Tester {

	public static void main(String[] args) {
		
		
		Suhas_StudentDAO dao = new Suhas_StudentDAO();
			//Read:
			//read all hospital 
			dao.getAllStudentData();
			
			
			
			
			//if want to insert new record,then change the setter value
			// UI data
					StudentDTO dto = new StudentDTO();
					dto.setId(662);
					dto.setName("Manju");
					dto.setRollno("18329");
					dto.setAge("32");
					dto.setMarks("78");
					
					dao.insertHospitalData(dto);
					
				
			
		}
}

	


