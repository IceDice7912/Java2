package test.collection;

import java.util.HashSet;
import java.util.Iterator;


public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add(new SetTest());
		set.add(new SetTest());
		set.add("1");
		System.out.println(set);
		System.out.println(set.size());
		Iterator ite = set.iterator();
		System.out.println(ite);
		while(ite.hasNext()) {
		Object o = ite.next();
		System.out.println(o);
		}
	}

}
