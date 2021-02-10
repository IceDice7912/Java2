package java_과제2_이상묵;

public class BookTest {

	public static void main(String[] args) {
		System.out.println("*** 도서 목록 ***");
		
		Book b1 = new Book("21424", "Java Basic", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
		System.out.println(b1.toString());
		
		Book b2 = new Book("33455", "Java Pro", "김철수", "Jaen.kr", 23000, "");
		System.out.println(b2.toString());
		
		Book b3 = new Book("55355", "Servlet/JSP", "박자바", "Jaen.kr", 41000, "Model2 기반");
		System.out.println(b3.toString());		
		
		Book b4 = new Book("35332", "Android App", "홍길동", "Jaen.kr", 25000, "Lightweight FrameWork");
		System.out.println(b4.toString());
		
		Book b5 = new Book("35355", "OOAD 분석, 설계", "소나무", "Jaen.kr", 30000, "");
		System.out.println(b5.toString());

		
		System.out.println();
		
		
		System.out.println("*** 잡지 목록 ***");
		
		Magazin m1 = new Magazin("35535", "Java World", "편집부", "Jaen.kr", 7000, "", 2013, 2);
		System.out.println(m1.toString());
		
		Magazin m2 = new Magazin("33434", "Mobile World", "편집부", "Jaen.kr", 8000, "", 2013, 8);
		System.out.println(m2.toString());
		
		Magazin m3 = new Magazin("75342", "Next Web", "편집부", "Jaen.kr", 10000, "AJAX 소개", 2012, 10);
		System.out.println(m3.toString());
		
		Magazin m4 = new Magazin("76543", "Architecture", "편집부", "Jaen.kr", 5000, "java 시스템", 2010, 3);
		System.out.println(m4.toString());
		
		Magazin m5 = new Magazin("76534", "Data Modeling", "편집부", "Jaen.kr", 14000, "", 2012, 2);
		System.out.println(m5.toString());
	}
}
