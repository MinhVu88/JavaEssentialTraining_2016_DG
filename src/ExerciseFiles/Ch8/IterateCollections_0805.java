package ExerciseFiles.Ch8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IterateCollections_0805 {

	public static void main(String[] args) {
		List<String> states = new ArrayList<>();
		
		states.add("New Jersey");
		
		states.add("California");
		
		states.add("Arkansas");
		
		System.out.print("\nthe ordered data in the states ArrayList: ");
		
		System.out.print(states + "\n");
		
		System.out.print("\n\t* ArrayList Iterator:\n");
		
		System.out.println("\n   - version 1: using a while loop");
		
		Iterator<String> i1 = states.iterator();		
		
		while (i1.hasNext()) {
			System.out.println("\n-> " + i1.next());
		}
		
		System.out.println("\n   - version 2: using a for loop");
		
		for(Iterator<String> i2 = states.iterator(); i2.hasNext();) {
			System.out.println("\n-> " + i2.next());
		}
		
		System.out.print("\n\t* ArrayList for-each:\n");
		
		for (String s : states) {
			System.out.println("\n-> " + s);
		}
		
		System.out.print("\n\t* Method reference (only in Java 8 onwards & not in Java's Android version):\n\n");
		
		states.forEach(System.out::println);
		
		Map<String, String> countryCapital = new HashMap<>();
		
		countryCapital.put("China", "Beijing");
		
		countryCapital.put("Korea", "Seoul");
		
		countryCapital.put("France", "Paris");
		
		System.out.println("\nThe unordered data in the countryCapital HashMap: " + countryCapital);
		
		System.out.print("\n\t* HashMap Iterator:\n");
		
		Set<String> keys = countryCapital.keySet();
		
		Iterator<String> i3 = keys.iterator();
		
		while (i3.hasNext()) {
			String key = i3.next();
			
			System.out.println("\n-> The capital of " + key + ": " + countryCapital.get(key));
		}
		
		System.out.print("\n\t* HashMap for-each:\n");
		
		for (String k : keys) {
			System.out.println("\n-> The capital of " + k + ": " + countryCapital.get(k));
		}
	}

}
