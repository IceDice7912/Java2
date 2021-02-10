package test.static_;

public class Test {
	
	public static void main(String[] args) {
		
		A o1=new A("전은수");
		A.count++;
		
		A o2=new A("홍길동");
		A.count++;
		
		A.printCount();
		
		long time = System.currentTimeMillis();
		System.out.println("현재 시간 : " + time);

	}

}

class A{
	String name;
	static int count=0;//방문자수
	static public void printCount() {
		System.out.println(count);
	}
	A(String name){
		this.name=name;
	}
	
	
}
