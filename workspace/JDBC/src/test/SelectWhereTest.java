package test;
import java.sql.*;
public class SelectWhereTest {
	public static void main(String[] args) {	
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			//1.driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver ok");
			
			//2.연결
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Shop","1234");
			System.out.println("con ok");
			
			//3.Statement 생성
			 stmt=con.createStatement();
			
			//4.SQL전송
			 rs=stmt.executeQuery("select * from membertbl where memberaddress like '%"+args[0]+"%' ");
			
			//5.결과 얻기
			while(rs.next()) {
				String id=rs.getString("memberid");
				String name=rs.getString("membername");
				String addr=rs.getString(3);
				System.out.println(id+":"+name+":"+addr);
			}			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//6.자원 종료
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				
			}
		}

	}

}
