package ExerciseFiles.Ch7;

public class Loops_0703 {

	public static void main(String[] args) {
		String[] months = {"Jan", "Feb", "Mar", "Apr", "may", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		System.out.println();
		
		for (int i = 0; i < months.length; i++) {
			System.out.print(" " + months[i]);
		}
		
		System.out.println("\n");
		
		for(int i = months.length - 1; i >= 0; i--) {
			System.out.print(" " + months[i]);
		}
		
		System.out.println("\n");
		
		for (String m : months) {
			System.out.print(" " + m);
		}
		
		System.out.println("\n");
		
		int counter1 = 0;
		
		while (counter1 < months.length) {
			System.out.print(" " + months[counter1]);
			
			counter1++;
		}
		
		System.out.println("\n");
		
		int counter2 = 0;
		
		do {
			counter2++;
			
			System.out.print(" " + months[counter2 - 1]);
		} while (counter2 < months.length);
		
	}

}
