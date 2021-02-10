package java_과제1_이상묵;

public class BookTest {

	public static void main(String[] args) {
		System.out.println("*** 도서 목록 ***");
		
		Book b1 = new Book();
		b1.isbn="21424";
		b1.title="Java Pro";
		b1.author="김하나";
		b1.publisher="Jaen.kr";
		b1.price=15000;
		b1.desc="기본문법";
		System.out.println(b1.toString());
		
		Book b2 = new Book();
		b2.isbn="35355";
		b2.title="OOAD 분석, 설계";
		b2.author="소나무";
		b2.publisher="Jaen.kr";
		b2.price=30000;
		b2.desc="";
		System.out.println(b2.toString());
		
		Magazin m = new Magazin();
		m.isbn="35535";
		m.title="Java World";
		m.author="편집부";
		m.publisher="androidjava.com";
		m.year=2013;
		m.month=2;
		m.price=7000;
		m.desc="";
		System.out.println(m.toString());
	}
}
