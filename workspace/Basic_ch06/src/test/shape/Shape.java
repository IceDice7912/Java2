package test.shape;

public abstract class Shape {
	public abstract void area (); {
}
	
class Polygon extends Shape{
	
	@Override
	public void area() {
		System.out.println("오각형의 넓이");
	}
}
}