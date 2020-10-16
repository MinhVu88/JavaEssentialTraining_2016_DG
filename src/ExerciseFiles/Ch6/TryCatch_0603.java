package ExerciseFiles.Ch6;

// handle exceptions with try-catch block

public class TryCatch_0603 {

	public static void main(String[] args) {
		String welcome = "Welcome!";
		
		try {
			char[] chars = welcome.toCharArray();
			
			System.out.println("\nthe last character in the chars array: " + chars[chars.length]);
		
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
