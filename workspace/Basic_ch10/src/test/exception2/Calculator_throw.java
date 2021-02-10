package test.exception2;

public class Calculator_throw {
		public int divide(int x, int y) throws MyException {
			int z=0;
			if(z==0) {
				throw new MyException("0으로 입력하지 마세욧");
			}
			z=x/y;
			return z;
		}
	}