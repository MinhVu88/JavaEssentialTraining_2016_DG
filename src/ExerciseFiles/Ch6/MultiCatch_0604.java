package ExerciseFiles.Ch6;

// create multiple catch blocks

public class MultiCatch_0604 {

	public static void main(String[] args) {
		String welcome = "Welcome!";
		
		try {
			char[] chars = welcome.toCharArray();
			
			System.out.println("\nthe last character in the chars array: " + chars[chars.length - 1]);
			
			String subStr = welcome.substring(10);
		
		} catch (ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			
			System.out.println("\narray index problem");
		
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("\nString index problem");
		}
	}

}
