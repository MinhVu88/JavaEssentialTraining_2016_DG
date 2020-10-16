package ExerciseFiles.Ch7;

// overloading methods (methods whose names are identical) are distinguished among themselves based on the different signatures

import java.util.Scanner;

public class Overloading_0705 {

	public static void main(String[] args) {
		String input1 = getInput("enter input 1: ");
		
		String input2 = getInput("enter input 2: ");
		
		String input3 = getInput("enter input 3: ");
		
		System.out.println("\nthe 1st result: " + addValues(input1, input2));
		
		System.out.println("\nthe 2nd result: " + addValues(input1, input2, input3));
		
		System.out.println("\nthe 3rd result: " + addValues(input1, input2, input3, input1, input2, input3, input1, input2, input3, input1, input2, input3));
	}
	
	static String getInput(String prompt) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\n" + prompt);
		
		return kbi.nextLine();
	}
	
	static double addValues(String str1, String str2) {
		return Double.parseDouble(str1) + Double.parseDouble(str2);
	}
	
	static double addValues(String str1, String str2, String str3) {
		return Double.parseDouble(str1) + Double.parseDouble(str2) + Double.parseDouble(str3);
	}
	
	/**
	 * 
	 * @param values an indefinite number of arguments
	 * @return a double result
	 */
	static double addValues(String ... values) {
		double result = 0.0;
		
		for (String v : values) {
			result += Double.parseDouble(v);
		}
		
		return result;
	}

}
