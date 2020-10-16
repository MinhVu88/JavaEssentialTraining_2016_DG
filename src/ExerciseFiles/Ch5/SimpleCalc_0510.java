package ExerciseFiles.Ch5;

import java.util.Scanner;

public class SimpleCalc_0510 {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		double input1, input2;
		
		String mathOperation;
		
		System.out.print("\nnumeric value #1: ");
		
		input1 = kbi.nextDouble();
		
		System.out.print("\nnumeric value #2: ");
		
		input2 = kbi.nextDouble();
		
		kbi.nextLine();
		
		System.out.print("\nchoose 1 of these following mathematical operations:\n" 
							+ "\n* Addition -> a\n"
							+ "\n* Subtraction -> s\n"
							+ "\n* Multiplication -> mu\n"
							+ "\n* Division -> d\n"
							+ "\n* Modulus -> mo\n\n");
		
		mathOperation = kbi.nextLine();
		
		if(mathOperation.equalsIgnoreCase("a")) {
			System.out.println("\n\t=> the result: " + (input1 + input2));
		} 
		
		if(mathOperation.equalsIgnoreCase("s")) {
			if(input1 > input2) {
				System.out.println("\n\t=> the result: " + (input1 - input2));
			}else {
				System.out.println("\n\t=> the result: " + (input2 - input1));
			}
		} 
		
		if(mathOperation.equalsIgnoreCase("mu")) {
			System.out.println("\n\t=> the result: " + (input1 * input2));
		} 
			
		if(mathOperation.equalsIgnoreCase("d")) {
			if(input1 > input2) {
				System.out.println("\n\t=> the result: " + (input1 / input2));
			}else {
				System.out.println("\n\t=> the result: " + (input2 / input1));
			}
		} 
			
		if(mathOperation.equalsIgnoreCase("mo")) {
			if(input1 > input2) {
				System.out.println("\n\t=> the result: " + (input1 % input2));
			}else {
				System.out.println("\n\t=> the result: " + (input2 % input1));
			}
		}
		
		kbi.close();
	}

}
