package web.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import web.util.Member;
import web.util.MyException;

public class MemberDAO {
	
	public MemberDAO () throws MyException {
	try {
		Class.forName("Oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		throw new MyException("Driver Error");
		}
	}
	
	public void memberInsert(Member m) throws MyException {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "cafe", "1234");
			stmt = con.prepareStatement("insert into member(memid, memname) values(?, ?)");
			stmt.setString(1, m.getId());
			stmt.setString(2, m.getName());
			int i = stmt.executeUpdate();
			System.out.println(i + " insert");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MyException("Insert Error");
		} finally {
			try {
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			
			}
		}
	}
}