package ExerciseFiles.Ch6;

// throw custom exceptions

public class Throw_0605 {

	public static void main(String[] args) {
		String welcome = "Welcome!";
		
		try {
			char[] chars = welcome.toCharArray();
			
			if(chars.length < 10) {
				throw new Exception("\nmy custom message");
			}
			
			System.out.println("\nthe last character in the chars array: " + chars[chars.length - 1]);
			
			System.out.println("\nsubstring: " + welcome.substring(10));
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("\narray index problem");
		
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("\nString index problem");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
