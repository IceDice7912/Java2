package test.exception;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=100;
			int y=Integer.parseInt(args[0]);
			System.out.println(x/y);
		}catch(ArithmeticException e) {
			System.out.println("오류 : 숫자 0으로 나누려고 함, 에러 코드 : " + e);
		}catch(NumberFormatException e) {
			System.out.println("오류 : 인티저값으로 변경 불가능, 에러 코드 : " + e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("오류 : 배열값 없음, 에러 코드 : " + e);
		}
		
		System.out.println("아주 중요한 일 시작...");
	}
}
