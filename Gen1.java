package coreJava12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gen1 {

	public static void main(String[] args) {
		// Without Generics
		List list = new ArrayList();
		//list.add(10);
		list.add("Bala");
		String s = (String)list.get(0);
		System.out.println(s);
		System.out.println(list.get(0));
		System.out.println(list);
		//with generics
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		//list1.add("10");
		//list1.add("Java");
		//LinkedList, HashSet, TreeSet
		List< String> list2 = new ArrayList<String>();
		list2.add("Java");
		list2.add("Python");
		list2.add("Spring Boot");
		Iterator<String> itr = list2.iterator();
		System.out.println("====================");
		while(itr.hasNext()) {			
			System.out.println(itr.next());
		}
		String str1 = list2.get(0);
		System.out.println(str1);
	}

}
