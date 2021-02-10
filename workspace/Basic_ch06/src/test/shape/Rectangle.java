package test.shape;

public class Rectangle extends Shape {
	private int w,h;
	
	public void setW(int w) {
		if(w>0) {
			this.w=w;
		}else {
			System.out.println("0보다 큰 수를 입력하세요ㅕ");
		}
	}
	
	public void seth(int h) {
		if(h>0) {
			this.h=h;
		}else {
			System.out.println("0보다 큰 수를 입력하세요ㅕ");
		}
	}
	
	public int getW() {
		return w;
	}


	public int getH() {
		return h;
	}
	
	public void area() {
		System.out.println("사각형의 넓이="+(w*h));
	}

}
