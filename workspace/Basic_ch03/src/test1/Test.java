package test1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyProfile m1 = new MyProfile();
		m1.setProfile("전은수", 32, 160.5, '여', true);
		System.out.println(m1);
		m1.printProfile();
		
		System.out.println("");
		
		MyProfile m2 = new MyProfile();
		m2.setProfile("홍길동", 28, 180.5, '남', false);
		System.out.println(m2);
		m2.printProfile();
	}

}
