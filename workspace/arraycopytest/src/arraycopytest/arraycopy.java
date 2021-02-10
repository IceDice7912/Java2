package arraycopytest;

public class arraycopy {
	public static void main(String[] args) {
		int array1[]= {1, 2, 3, 4};
		int array2[]= {5, 6, 7, 8, 9, 10};
		
		for(int i=0; i<array1.length; i++)
		{
			System.out.print(array1[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<array2.length; i++)
		{
			System.out.print(array2[i]+" ");
		}
		
		System.arraycopy(array1, 0, array2, 2, 3);
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<array1.length; i++)
		{
			System.out.print(array1[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<array2.length; i++)
		{
			System.out.print(array2[i]+" ");
		}
		
	}
}