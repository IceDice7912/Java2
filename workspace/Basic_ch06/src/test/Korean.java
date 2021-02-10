package test;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;

	//생성자
	/*public Korean(String n, String s) {
	  name = n;
	  ssn = s;
	}*/
	
	public Korean(String name, String ssn) {
	  this.name = name;
	  this.ssn = ssn;
	}
	
	public Korean() {
		this("홍길동", "000000-0000000");
	}
}

