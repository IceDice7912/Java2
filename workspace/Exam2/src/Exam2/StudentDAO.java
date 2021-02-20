package Exam2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	
	Connection con;
	PreparedStatement stmt;
	
	public void inserStudent(StudentDTO studentDTO) {
		
		try {			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Test","1234");
			stmt=con.prepareStatement("insert into Student values (?,?,?,?,?)");
			stmt.setInt(1, studentDTO.getNo());
			stmt.setString(2, studentDTO.getname());
			stmt.setString(3, studentDTO.getdet());
			stmt.setString(4, studentDTO.getaddr());
			stmt.setString(5, studentDTO.gettel());
			int i = stmt.executeUpdate();
			System.out.println(i + " insert OK\n");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert Error : " + e);
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(con !=null) con.close();
			} catch (SQLException e) {
				System.out.println("insert Error : " + e);
			}
			
		}	
	}
	
	public void printAllStudents() {
		
		try {			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Test","1234");
			stmt=con.prepareStatement("select * from Student");			
			ResultSet rs=stmt.executeQuery();
			ArrayList<StudentDTO> list=new ArrayList<StudentDTO>();
			System.out.println("Table Load OK\n");
			while(rs.next()) {
				int No=rs.getInt(1);
				String name=rs.getString(2);
				String det=rs.getString(3);
				String addr=rs.getString(4);
				String tel=rs.getString(5);
				StudentDTO m=new StudentDTO();
				list.add(m);
				System.out.println(No+"\t"+name+"\t"+det+"\t"+addr+"\t"+tel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error : " + e);
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(con !=null) con.close();
			} catch (SQLException e) {
				
			}
			
		}	
	}
	
}
