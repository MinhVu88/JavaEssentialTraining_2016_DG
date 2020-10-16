package ExerciseFiles.Ch8;

import java.util.Arrays;

public class SimpleArrays_0801 {

	public static void main(String[] args) {
		System.out.print("\nan array of primitives, sorted in ascending order: ");
		
		int[] ints = {3, 8, 5, 6, 1, 4, 2, 0, 9, 7};
		
		Arrays.sort(ints);
		
		for (int i = 0; i < ints.length; i++) {
			System.out.print(" " + ints[i]);
		}
		
		System.out.print("\n\nan array of names, sorted alphabetically: ");
		
		String[] names = {"Jake", "Mike", "Ian", "Helen", "Colin", 
							"Gary", "Alan", "Kathleen", "Roland", "Zach", 
							"Edward", "Tim", "Oscar", "Wayne", "Paul",
							"Fred", "Donald", "Samuel", "Vincent", "Ned"};
		
		Arrays.sort(names);
		
		for (String n : names) {
			System.out.print(" " + n);
		}
		
		System.out.print("\n\nan array with an initial size (10 in length): ");
		
		int[] evenNumbers = new int[10];
		
		for (int i = 0; i < evenNumbers.length; i++) {
			evenNumbers[i] = i * 2;
		}
		
		for (int n : evenNumbers) {
			System.out.print(" " + n);
		}
		
		System.out.print("\n\na copied array of evenNumbers (the 1st 5 elements): ");
		
		int[] copiedArray = new int[5];
		
		System.arraycopy(evenNumbers, 0, copiedArray, 0, 5);
		
		for (int e : copiedArray) {
			System.out.print(" " + e);
		}
	}

}
