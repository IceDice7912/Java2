package com.lsm;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello 상묵");
		
		MyProfile m1 = new MyProfile();
		MyProfile m2 = new MyProfile();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1==m2);
		//이것이 객체이느냐하고 묻는거라고 함//
		System.out.println(m1 instanceof Object);
		System.out.println(m2 instanceof Object);
	}
}