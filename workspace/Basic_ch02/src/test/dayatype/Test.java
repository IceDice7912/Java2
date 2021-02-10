package test.dayatype;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myname = "이상묵";
		int age = 32;
		double tall = 160.5;
		char gender = '여';
		boolean isPretty = true;
		MemberName name = new MemberName();
		String testname = new String("가나다라마바사");
		Date birthday = new Date(1980,10,3);
		
		System.out.println(age);
		System.out.println(tall);
		System.out.println(gender);
		System.out.println(isPretty);
		System.out.println(myname);
		System.out.print(name.name1);
		System.out.print(name.name2);
		System.out.println(name.name3);
		System.out.println(name.name1+name.name2+name.name3);
		System.out.println(name.name1+""+name.name2+""+name.name3);
		System.out.println(testname);
		System.out.println(birthday.getYear()+"년"+birthday.getMonth()+"월"+birthday.getDay()+"일");
	}
}