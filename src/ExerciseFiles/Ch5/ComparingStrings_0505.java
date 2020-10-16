package ExerciseFiles.Ch5;

// compare String values

public class ComparingStrings_0505 {

	public static void main(String[] args) {
		String str1 = "Hello", str2 = "Hello", str3 = "hello";
		
		if(str1 == str2) {
			System.out.println("\nthey match");
		}else {
			System.out.println("\nthey don't match");
		}
		
		if(str1 == str3) {
			System.out.println("\nthey match");
		}else {
			System.out.println("\nthey don't match");
		}
		
		String part1 = "Hello ", part2 = "World", str4 = part1 + part2, str5 = "Hello World";
		
		if(str4 == str5) {
			System.out.println("\nthey match");
		}else {
			System.out.println("\nthey don't match");
		}
		
		// use equals()
		if(str4.equals(str5)) {
			System.out.println("\nthey match");
		}else {
			System.out.println("\nthey don't match");
		}
		
		// use equalsIgnoreCase()
		String part3 = "WORLD", str6 = part1 + part3, str7 = "Hello World";
		
		if(str6.equals(str7)) {
			System.out.println("\nthey match");
		}else {
			System.out.println("\nthey don't match");
		}
		
		if(str6.equalsIgnoreCase(str7)) {
			System.out.println("\nthey match");
		}else {
			System.out.println("\nthey don't match");
		}
	}

}
