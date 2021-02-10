package test.shape;

import java.awt.Button;
import java.awt.Component;

public class Test {
	
	public static void main(String[] args) {

//		Shape s = new Circle();
//		s.area();
		
		Button com = new Button("전송");
		System.out.println(com.getLabel());
//		
//		Component com = new Button();
		
		Shape s = new Polygon();
		s.area();
		
		
		
		//		Circle c = new Circle();
//		c.setRadius(-5);
//		Rectangle r = new Rectangle();
//		r.seth(-5);
//		r.setW(-10);
//		Triangle t = new Triangle();
//		t.seth(10);
//		t.setW(5);
//		
//		Printer out = new Printer();
//		out.print(c);
//		out.print(r);
//		out.print(t);
////		out.print("java");
	}

}
