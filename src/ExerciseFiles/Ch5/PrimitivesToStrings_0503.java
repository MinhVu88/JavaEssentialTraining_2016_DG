package ExerciseFiles.Ch5;

// convert primitive values to strings

import java.text.NumberFormat;

public class PrimitivesToStrings_0503 {

	public static void main(String[] args) {
		int intValue = 42;
		
		System.out.println("\nint: " + intValue + " -> String: " + Integer.toString(intValue));
		
		boolean booValue = true;
		
		System.out.println("\nboolean: " + booValue + " -> String: " + Boolean.toString(booValue));
		
		long longValue = 10_000_000;
		
		NumberFormat formatter = NumberFormat.getNumberInstance();
		
		String formatted = formatter.format(longValue);
		
		System.out.println("\n" + longValue + " is formatted as " + formatted);
	}

}
