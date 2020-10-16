package ExerciseFiles.Ch8;

import java.util.HashMap;
import java.util.Map;

public class HashMap_0804 {

	public static void main(String[] args) {
		Map<String, String> countryCapital = new HashMap<>();
		
		countryCapital.put("China", "Beijing");
		
		countryCapital.put("Korea", "Seoul");
		
		countryCapital.put("France", "Paris");
		
		countryCapital.put("England", "London");
		
		countryCapital.put("Russia", "Moscow");
		
		System.out.println("\nthe unordered data in the countryCapital HashMap: " + countryCapital);
		
		countryCapital.put("Japan", "Tokyo");
		
		System.out.println("\nthe updated countryCapital: " + countryCapital);
		
		System.out.println("\nthe capital of France: " + countryCapital.get("France"));
		
		System.out.print("\nremoving the Japan key & its value from countryCapital: ");
		
		countryCapital.remove("Japan");
		
		System.out.print(countryCapital);
	}

}
