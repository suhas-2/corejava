package Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Hospital.JDBCConnectionUtil;

public class HotelDao {
	
	
	  public void insertHotelDTO(){
			HotelDTO dto = new HotelDTO();
			
			dto.setId(54698);
			dto.setName("GFC");
			dto.setFoodItem("Muttun");
			dto.setPrice("180Rs");
			dto.setRating("3.5Star");
			
		    
	
	
    String insertQuery= "insert into hotel values (?,?,?,?,?)";
    
    Connection con = JdbcConnectionUtil.getConnection();
    
    PreparedStatement preparedStatement;
    
    try {
		preparedStatement = con.prepareStatement(insertQuery);
		preparedStatement.setInt(1, dto.getId());
		preparedStatement.setString(2, dto.getName());
		preparedStatement.setString(3, dto.getFoodItem());
		preparedStatement.setString(4, dto.getPrice());
		preparedStatement.setString(5, dto.getRating());
		
		
		//step4 execute query
		int count = preparedStatement.executeUpdate();
		System.out.println("==========record inserted===========" + count);
		
		 //step 5 close connection
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
    }
	  
	  public void getAllHotelData() {
	    	
	    	String selectQry = "select * from hotel";
	    	
	    	Connection con = JDBCConnectionUtil.getConnection();
	    	
	    	
	    	try {
	    		PreparedStatement psmt = con.prepareStatement(selectQry);
				
				ResultSet resultSet = psmt.executeQuery();
				
				while(resultSet.next()) {
					
					HotelDTO dto = new HotelDTO();
					
					dto.setId(resultSet.getInt(1));
					dto.setName(resultSet.getString(2));
					dto.setFoodItem(resultSet.getString(3));
					dto.setPrice(resultSet.getString(4));
					dto.setRating(resultSet.getString(5));
					
					System.out.println("-------------all data--------------"+dto.toString());
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	}
	  public void updateHotelDataById(String foodItem, int id) {
		  
		  String updateQuery = "update hotel set foodItem = ? where id=?";
		  
		  Connection connection = JDBCConnectionUtil.getConnection();
		  
		  try {
			PreparedStatement psmt = connection.prepareStatement(updateQuery);
			
			psmt.setString(1, foodItem);
			psmt.setInt(2, id);
			
			int countofrows = psmt.executeUpdate();
			System.out.println("---------record updated------------------"+countofrows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  
	  }
	  
	  public void deleteHotelDataById(int deleteId) {
			String deleteQry = "delete from hotel where id=?";
			Connection connection = JDBCConnectionUtil.getConnection();

			try {
				PreparedStatement pstmt = connection.prepareStatement(deleteQry);
				pstmt.setInt(1, deleteId);

				int countofrows = pstmt.executeUpdate();
				System.out.println("---------record deleted------------------"+countofrows);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}