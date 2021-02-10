package test.stmt;

public class continueTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for(i=0; i<=100; i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
