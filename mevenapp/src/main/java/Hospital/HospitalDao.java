package Hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HospitalDao {
	
			public void insertHospitalDTO(){
			
			HospitalDTO dto = new HospitalDTO();
			
			dto.setId(18);
			dto.setName("Aakash");
			dto.setAge("45");
			dto.setGender("trans");
			dto.setRoomNo("34");
			dto.setHospitalName("victoria");
			dto.setDoctorName("Joseph");
			dto.setHospitalAddress("vajrahalli");
			dto.setContactNo("7893456683");
			
			
			
			String insertQuery = "insert into hospital values(?,?,?,?,?,?,?,?,?)";
			
			Connection con = JDBCConnectionUtil.getConnection();
			
			PreparedStatement pst;
			
			try {
				pst = con.prepareStatement(insertQuery);
				pst.setInt(1,dto.getId());
				pst.setString(2, dto.getName());
				pst.setString(3, dto.getAge());
				pst.setString(4, dto.getGender());
				pst.setString(5, dto.getRoomNo());
				pst.setString(6, dto.getHospitalName());
				pst.setString(7, dto.getDoctorName());
				pst.setString(8, dto.getHospitalAddress());
				pst.setString(9, dto.getContactNo());
			
				int count = pst.executeUpdate();
				System.out.println("=====Data Inserted===== "+count );
				
				con.close();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			}
			
			public void getHospitalDetails() {
				
				String selectQry = "Select * from hospital";
				
				Connection connection = JDBCConnectionUtil.getConnection();
				
				PreparedStatement pst;
				
				try {
					pst = connection.prepareStatement(selectQry);
					
					ResultSet result = pst.executeQuery();
					
					while(result.next()) {
						
						HospitalDTO dto1 = new HospitalDTO();
						
						dto1.setId(result.getInt(1));
						dto1.setName(result.getString(2));
						dto1.setAge(result.getString(3));
						dto1.setGender(result.getString(4));
						dto1.setRoomNo(result.getString(5));
						dto1.setHospitalName(result.getString(6));
						dto1.setDoctorName(result.getString(7));
						dto1.setHospitalAddress(result.getString(8));
						dto1.setContactNo(result.getString(9));
						
						System.out.println("-----Patient Information-----" +dto1.toString());
						
						
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			public void deletePatientById(int deleteId) {
				
				String deleteQuery = "Delete from hospital where id = ?";
				
				Connection con = JDBCConnectionUtil.getConnection();
				
				 try {
					PreparedStatement pstmt = con.prepareStatement(deleteQuery);
					pstmt.setInt(1, deleteId);
					
					int countofrows = pstmt.executeUpdate();
					System.out.println("---------record deleted------------------"+countofrows);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			public void hospitalDataById(String hospitalName, int id) {
				
				String updateQuery = "update hospital set hospitalName= ? where id=?";
				
				Connection con = JDBCConnectionUtil.getConnection();
				
				try {
					PreparedStatement pst = con.prepareStatement(updateQuery);
					pst.setString(1, hospitalName);
					pst.setInt(2, id);
					
					int countfrows = pst.executeUpdate();
					System.out.println("---------record UPDATED------------------"+countfrows);
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 			}
		
		
		
	} 
	
	
	

	


