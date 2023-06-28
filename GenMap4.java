package coreJava12;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class GenMap4 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "Bala");
		map.put(101, "Sam");
		map.put(102, "Harry");
		//returns a Set View
		map.entrySet()
		//Get a Sequential Stream
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(System.out::println);
	}

}
