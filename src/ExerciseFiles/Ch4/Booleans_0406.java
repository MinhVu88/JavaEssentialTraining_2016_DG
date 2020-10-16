package ExerciseFiles.Ch4;

// work with Boolean values & expressions
public class Booleans_0406 {
	
	static boolean bDef;
	
	public static void main(String[] args) {
		boolean b1 = true, b2 = false;
		
		System.out.println("\nb1: " + b1 + ", b2: " + b2 + " & bDef: " + bDef);
		
		boolean b3 = !b1;
		
		System.out.println("\nb3: " + b3);
		
		int int1 = 0;
		
		boolean b4 = (int1 != 0);
		
		System.out.println("\nb4: " + b4);
		
		String sBoolean = "true";
		
		boolean parsed = Boolean.parseBoolean(sBoolean);
		
		System.out.println("\nparsed: " + parsed);
	}

}
