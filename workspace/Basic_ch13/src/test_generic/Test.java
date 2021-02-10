package test_generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String>list = new ArrayList<String>();
		list.add("Hi");
		
		String array[] = new String[10];
		array[0]="Hi";
		
		System.out.println(list);
		System.out.println(array[0]);
		
		int all[]=new int[10];
		all[0]= 1;
		
		List list2=new ArrayList();
		list2.add(1);
		
		System.out.println(all[0]);
		System.out.println(list2);
	}

}
