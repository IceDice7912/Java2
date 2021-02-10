//시험 나온덴다

package test.inheritance;

public class People {
	public String name;
	public String ssn;
	
	
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}



	public People(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends People {
	Student(){
		super(); //super에 아구먼트 안받는 생성자가 없어서???? 시발 뭔 소리야 도대체
	}
}
