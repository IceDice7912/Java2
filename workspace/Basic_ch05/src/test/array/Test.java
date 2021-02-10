package test.array;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []all = new int[100];
		System.out.println(all);
		for(int i=0; i<100; i++)
		{
			all[i]=i;
		}
		System.out.println(all[0]);
		System.out.println(all[1]);
		System.out.println(all[50]);
		System.out.println(all.length);
	}

}
