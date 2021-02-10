package test.stmt;

public class switchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month=10;
		switch(month)
		{
			case 1: 
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12: 
				System.out.println(month+"월은 31일까지 있습니다.");
			break;
			
			case 2:
				System.out.println(month+"월은 28일까지 있습니다.");				
				
			case 4: 
			case 6: 
			case 9: 
			case 11: 
				System.out.println(month+"월은 30일까지 있습니다.");
			break;
			
			default:
				System.out.println("잘못된 값입니다.");
			
		}
	}

}
