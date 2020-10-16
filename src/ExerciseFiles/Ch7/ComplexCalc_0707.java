package ExerciseFiles.Ch7;

import java.util.Scanner;

public class ComplexCalc_0707 {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		try {
			System.out.print("\ninput 1: ");

			String x = kbi.nextLine();

			System.out.print("\ninput 2: ");

			String y = kbi.nextLine();
			
			System.out.print("\nchoose 1 of these following mathematical operations:\n" 
					+ "\n* Addition -> +\n"
					+ "\n* Subtraction -> -\n"
					+ "\n* Multiplication -> *\n"
					+ "\n* Division -> /\n"
					+ "\n* Modulus -> %\n\n");

			String mathOperation = kbi.nextLine();
			
			switch (mathOperation.charAt(0)) {
			case '+':
				System.out.println("\nthe result: " + add(x, y));
				break;
			case '-':
				System.out.println("\nthe result: " + minus(x, y));
				break;
			case '*':
				System.out.println("\nthe result: " + multiply(x, y));
				break;
			case '/':
				System.out.println("\nthe result: " + divine(x, y));
				break;
			case '%':
				System.out.println("\nthe result: " + modulus(x, y));
				break;
			default:
				System.out.println("\ninvalid mathematical operator");
				break;
			}
				
		} catch (Exception e) {
			System.out.println("\nnumber formatting exception: " + e.getMessage());
		}
		
		kbi.close();
	}
	
	private static double add(String x, String y) {
		return Double.parseDouble(x) + Double.parseDouble(y);
	}
	
	private static double minus(String x, String y) {
		double result;
		
		if(Double.parseDouble(x) > Double.parseDouble(y)) {
			result = Double.parseDouble(x) - Double.parseDouble(y);
		}else {
			result = Double.parseDouble(y) - Double.parseDouble(x);
		}
		
		return result;
	}
	
	private static double multiply(String x, String y) {
		return Double.parseDouble(x) * Double.parseDouble(y);
	}
	
	private static double divine(String x, String y) {
		double result;
		
		if(Double.parseDouble(x) > Double.parseDouble(y)) {
			result = Double.parseDouble(x) / Double.parseDouble(y);
		}else {
			result = Double.parseDouble(y) / Double.parseDouble(x);
		}
		
		return result;
	}
	
	private static double modulus(String x, String y) {
		double result;
		
		if(Double.parseDouble(x) > Double.parseDouble(y)) {
			result = Double.parseDouble(x) % Double.parseDouble(y);
		}else {
			result = Double.parseDouble(y) % Double.parseDouble(x);
		}
		
		return result;
	}
}
