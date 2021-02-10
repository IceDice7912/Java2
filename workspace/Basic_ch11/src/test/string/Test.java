package test.string;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("java1");
		String s2=new String("java2");
		String s3="java3";
		String s4="java4";
		String s5=s1.concat("111");
		
		s1.concat("111");
		s2.concat("222");
		s3.concat("333");
		s4.concat("444");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s5==s1);
		
		StringBuilder sb1 = new StringBuilder("java-B");
		sb1.append("1");
		System.out.println(sb1);
		StringBuilder sb2 = sb1.append("2");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1==sb2);
		
		
	}
}