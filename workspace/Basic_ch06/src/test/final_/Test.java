package test.final_;

public class Test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		B b = new B();
//		b.i++;
//		b.printI();
		Object o1 = new Object();
		System.out.println("o1 스트링 주소값 : " + o1.toString());
		Object o2 = new Object();
		System.out.println("o2 스트링 주소값 : " + o2.toString());
		System.out.println(o1==o2);
		System.out.println("o1과 o2의 주소값이 같느냐 : " + o1.equals(o2));
		
		System.out.println();
		
		Test t1 = new Test();
		System.out.println("t1 스트링 주소값 : " + t1.toString());
		Test t2 = new Test();
		System.out.println("t2 스트링 주소값 : " + t2.toString());
		System.out.println(t1==t2);
		System.out.println("t1과 t2의 주소값이 같느냐 : " + t1.equals(t2));

		System.out.println();
		
		String s1 = new String("java");
		System.out.println("s1 스트링 주소값 : " + s1.toString());
		String s2 = new String("java");
		System.out.println("s2 스트링 주소값 : " + s2.toString());
		System.out.println("s1과 s2의 내용이 같느냐 " + s1==s2);
		System.out.println("s1과 s2의 주소값이 같느냐 " + s1.equals(s2));		
		
		System.out.println();
		
		String s3="java";
		System.out.println("s3 스트링 주소값 : " + s3.toString());
		String s4="java";
		System.out.println("s4 스트링 주소값 : " + s4.toString());
		System.out.println(s3==s4);
		System.out.println("s3과 s4의 주소값이 같느냐 : " + s3.equals(s4));				
		
	}
}

//class MyString extends String {
//	public String toString() {
//		return super.toString();
//	}
//}


//class A {
//	int i=10;
//	
//	public void printI() {
//		System.out.println("A의 i는 " + i);
//	}
//}
//
//class B extends A {
//	public void printI() {
//		System.out.println("A로부터 상속받은 i는 "+ i);
//	}
//}