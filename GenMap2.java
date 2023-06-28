package coreJava12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Bala");
		map.put(101, "Sam");
		map.put(102, "Harry");
		//Now use Map.Entry for set and Iterator
		//it returns the Set view containing all the keys and values
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		//Converting to Set so that we can traverse
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry e = itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}		
	}

}
