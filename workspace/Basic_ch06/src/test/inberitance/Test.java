package test.inberitance;

public class Test extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Object();
		System.out.println(o.toString());
		
		A a = new A();
		a.i++;
		a.printI();
		System.out.println(a);
		System.out.println(a.toString());
		
		B b = new B();
		b.x++;
		b.printX();
		b.i++;
		b.printI();
		System.out.println(b);
		System.out.println(b.toString());
	}
}