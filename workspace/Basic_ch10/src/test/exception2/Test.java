package test.exception2;

public class Test {
	public static void main(String args[]) {
		Calculator c = new Calculator();
		int result = c.divide(0, 0);
		System.out.println(result);
		System.out.println("중요한 일 시작...");
	}

}
