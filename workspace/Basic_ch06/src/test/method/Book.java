package test.method;

public class Book {
	
	public void want(String ...all) {
		for(String s:all)
		{
			System.out.println(s);
		}
	}
	
	public void test() {
		want("aaa");
	}
	
	public int test(int i) {
		return 0;
	}
}
