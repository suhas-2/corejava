package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Hospital.JDBCConnectionUtil;

public class Suhas_StudentDAO {
	
public void insertHospitalData(StudentDTO dto) {
		
		Connection connection = JDBCConnectionUtil.getConnection();
		//step3:
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement("insert into student values(?,?,?,?,?)");

			pst.setInt(1, dto.getId());
			pst.setString(2, dto.getName());
			pst.setString(3, dto.getRollno());
			pst.setString(4, dto.getAge());
			pst.setString(5, dto.getMarks());
			
			int count = pst.executeUpdate();
			System.out.println("--------Inserted one record-------------" + count);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void getAllStudentData() {

		
		String selectQry = "select * from userdetails.student";
		Connection connection = JDBCConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement(selectQry);

			ResultSet resultSet = pstmt.executeQuery();
			while (resultSet.next()) {

				StudentDTO dto = new StudentDTO();
				dto.setId(resultSet.getInt(1));
				dto.setName(resultSet.getString(2));
				dto.setRollno(resultSet.getString(3));
				dto.setAge(resultSet.getString(4));
				dto.setMarks(resultSet.getString(5));
				

				System.out.println("-------------all data--------------"+dto.toString());

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	

}
