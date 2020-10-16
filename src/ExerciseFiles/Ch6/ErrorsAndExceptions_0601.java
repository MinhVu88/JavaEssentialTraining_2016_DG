package ExerciseFiles.Ch6;

// syntax errors vs runtime exceptions

public class ErrorsAndExceptions_0601 {

	public static void main(String[] args) {
		String s = null;
		
		System.out.println("\n" + s);
		
		String welcome = "Welcome!";
		
		char[] chars = welcome.toCharArray();
		
		System.out.println("\nthe last character in the chars array: " + chars[chars.length]);
	}

}
