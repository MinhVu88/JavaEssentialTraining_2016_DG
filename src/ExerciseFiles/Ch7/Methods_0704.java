package ExerciseFiles.Ch7;

// create reusable code with methods

public class Methods_0704 {
	
	static String[] months = {"Jan", "Feb", "Mar", "Apr", "may", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	
	public static void main(String[] args) {
		char[] asterisks = {};
		
		loopIt("the 12 months of the year (the first run)", asterisks);
		
		loopIt("months of the year (2nd run)", asterisks);
		
		loopIt("the list of 12 months of the year (the third & final run)", asterisks);
	}
	
	static void loopIt(String label, char[] asterisks) {
		System.out.println("\n" + label);
		
		asterisks = new char[label.length()];
		
		for (int i = 0; i < asterisks.length; i++) {
			asterisks[i] = '*';
		}
		
		for (char a : asterisks) {
			System.out.print(a);
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < months.length; i++) {
			System.out.print(" " + months[i]);
		}
		
		System.out.println("\n");
	}

}
