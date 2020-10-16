package ExerciseFiles.Ch6;

public class Debugging_0602 {

	public static void main(String[] args) {
		String welcome = "Welcome!";
		
		char[] ch = welcome.toCharArray();
		
		System.out.println();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(" " + ch[i]);
		}
	}

}
