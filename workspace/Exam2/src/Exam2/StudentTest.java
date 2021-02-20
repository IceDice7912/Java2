package Exam2;

public class StudentTest {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Drive Register OK\n");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error : " + e);
		}
		
		StudentDAO DAO = new StudentDAO();
		StudentDTO DTO = new StudentDTO();
		
		DAO.inserStudent(DTO);
		DAO.printAllStudents();
	}
}
