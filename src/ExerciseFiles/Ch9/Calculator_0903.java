package ExerciseFiles.Ch9;

// create a nested & anonymous class (InputHelper)

import java.util.Scanner;

public class Calculator_0903 {

	public static void main(String[] args) {
		Calculator_0903 calc = new Calculator_0903();
		
		calc.calculate();
	}

	protected void calculate() {
		//Scanner kbi = new Scanner(System.in);
		
		InputHelper ih = new InputHelper();
		
		try {
			/*
			System.out.print("\ninput 1: ");
			
			String x = kbi.nextLine();
			*/
			
			String x = ih.getInput("\ninput 1: ");
			
			/*
			System.out.print("\ninput 2: ");
			
			String y = kbi.nextLine();
			*/
			
			String y = ih.getInput("\ninput 2: ");
			
			/* 
			System.out.print("\n\t[choose 1 of these following mathematical operations]\n" 
							 + "\n-> Addition: +\n"
							 + "\n-> Subtraction: -\n"
							 + "\n-> Multiplication: *\n"
							 + "\n-> Division: /\n\n"); 
			*/

			String mathOperation = ih.getInput("\n\t[choose 1 of these following mathematical operations]\n" 
												+ "\n-> Addition: +\n"
												+ "\n-> Subtraction: -\n"
												+ "\n-> Multiplication: *\n"
												+ "\n-> Division: /\n\n");
			
			switch (mathOperation.charAt(0)) {
			case '+':
				System.out.println("\n\t=> the result: " + MathHelper_0902.add(x, y));
				break;
			case '-':
				System.out.println("\n\t=> the result: " + MathHelper_0902.minus(x, y));
				break;
			case '*':
				System.out.println("\n\t=> the result: " + MathHelper_0902.multiply(x, y));
				break;
			case '/':
				System.out.println("\n\t=> the result: " + MathHelper_0902.divine(x, y));
				break;
			default:
				System.out.println("\n\t=> invalid mathematical operator");
				break;
			}
				
		} catch (Exception e) {
			System.out.println("\n\t=> number formatting exception: " + e.getMessage());
		}
		
		//kbi.close();
	}
	
	class InputHelper {
		private String getInput(String prompt) {
			System.out.print(prompt);
			
			@SuppressWarnings("resource")
			Scanner kbi = new Scanner(System.in);
			
			return kbi.nextLine();
		}
	}
	
}
