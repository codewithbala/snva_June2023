package coreJava12;

import java.util.HashMap;
import java.util.Map;

public class GenMap3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1001, "Bala");
		map.put(101, "Sam");
		map.put(102, "Harry");
		//returns a Set View
		map.entrySet()
		//Get a Sequential Stream
		.stream()
		// Returns a stream consisting of the elements of this stream, sortedaccording to natural order. If the elements of this stream are not Comparable, a java.lang.ClassCastException may be thrownwhen the terminal operation is executed. 
		//For ordered streams, the sort is stable. For unordered streams, nostability guarantees are made. 
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
	}
}
