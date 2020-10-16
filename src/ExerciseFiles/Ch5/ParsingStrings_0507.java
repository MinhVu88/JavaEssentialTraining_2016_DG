package ExerciseFiles.Ch5;

public class ParsingStrings_0507 {

	public static void main(String[] args) {
		String s1 = "welcome to California";
		
		System.out.println("\nlength of '" + s1 + "': " + s1.length());
		
		System.out.println("\nthe index position of 'California' in '" + s1 + "': " + s1.indexOf("California"));
		
		System.out.println("\nthe substring that starts at the 11th index position: " + s1.substring(11));
		
		String s2 = "welcome!                    ";
		
		System.out.println("\nlength of '" + s2 + "': " + s2.length());
		
		System.out.println("\nlength of '" + s2 + "' after removing all the whitespaces: " + s2.trim().length());
	}

}
