	package test.shape;

public class Printer {
	
	public void print(Shape s) {
//		if (o instanceof Circle) {
//			Circle c = (Circle) o;
//			c.radius=5;
//			c.areaCircle();
//		} else if (o instanceof Rectangle) {
//			Rectangle r = (Rectangle) o;
//			r.h=3;
//			r.w=4;
//			r.areaRec();
//		} else if (o instanceof Triangle) {
//			Triangle t = (Triangle) o;
//			t.h=8;
//			t.w=2;
//			t.areaTri();
//		}
		s.area();
		
	}
	
	public void print(Circle c) {
		System.out.println("원의 반지름 길이 : " + c.getRadius());
	}
	
	public void print(Rectangle r) {
		System.out.println("사각형 가로 길이 : " + r.getW());
	}

}
