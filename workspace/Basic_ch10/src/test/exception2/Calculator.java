package test.exception2;

public class Calculator {
	public int divide(int x, int y) {
		int z=0;

		try {
			z=x/y;
		}catch(ArithmeticException e){
			System.out.println("에러 : 0으로 나누기 시도. 에러 코드 : " + e);
		}
		return z;
	}
}
