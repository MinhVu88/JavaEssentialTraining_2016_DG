package ExerciseFiles.Ch5;

import java.text.NumberFormat;
import java.util.Locale;

// format numeric values as strings

public class FormatNumbers_0506 {

	public static void main(String[] args) {
		
		double doubleValue = 1_234_567.89;
		
		NumberFormat noF1 = NumberFormat.getNumberInstance();
		
		System.out.println("\n" + doubleValue + " is formatted as " + noF1.format(doubleValue) + " (without locale)");
		
		Locale locale = new Locale("de", "DE");
		
		NumberFormat noF2 = NumberFormat.getNumberInstance(locale);
		
		System.out.println("\n" + doubleValue + " is formatted as " + noF2.format(doubleValue) + " (with locale)");
		
		NumberFormat currencyF = NumberFormat.getCurrencyInstance(locale);
		
		System.out.println("\ncurrency: " + currencyF.format(doubleValue));
		
		NumberFormat intF = NumberFormat.getIntegerInstance();
		
		System.out.println("\n" + doubleValue + " is formatted to be an int -> " + intF.format(doubleValue));
	}

}
