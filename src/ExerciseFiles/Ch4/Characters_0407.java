package ExerciseFiles.Ch4;

// work with character values
public class Characters_0407 {

	public static void main(String[] args) {
		char ch1 = '1', ch2 = '2', ch3 = '3';
		
		System.out.println("\nchar #1: " + ch1 + ", char #2: " + ch2 + " & char #3: " + ch3);
		
		char dollarSign = '\u0024';
		
		System.out.println("\ndollar sign: " + dollarSign);
		
		char ch4 = 'a', ch5 = 'b', ch6 = 'c';
		
		System.out.println("\n" + ch4 + ch5 + ch6 + " -> " + Character.toUpperCase(ch4) + Character.toUpperCase(ch5) + Character.toUpperCase(ch6));
	}

}
