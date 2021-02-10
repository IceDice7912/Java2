package test.array;

public class stringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String all[]=new String[5];
		System.out.println(all);
		System.out.println(all[0]);
		all[1]="java";
		all[3]="자바";
		all[4]="이거 아마 이렇게 길어도 상관 없을껄";
		System.out.println(all[1]);
		for(int i=0; i<all.length; i++)
		{
			System.out.println(all[i]);
		}
	}

}
