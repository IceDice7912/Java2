package test.inberitance;

public class B extends A {
	public int x=1000;
	public int i=100;
	
	public void printX() {
		System.out.println(x);
	}
	
	public void printI() {
		System.out.println("B"+i);
	}
	
	public B() {
		super();
	}
}
