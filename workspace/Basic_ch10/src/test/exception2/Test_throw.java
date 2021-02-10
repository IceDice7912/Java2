package test.exception2;

public class Test_throw {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int result = 0;
		try {
		result = c.divide(100, 0);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(result);
		System.out.println("중요한 일의 시작...");
	}
}
