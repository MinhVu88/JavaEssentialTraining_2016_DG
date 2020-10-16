package ExerciseFiles.Ch4;

// use mathematical operators & the Math class

public class Math_0405 {

	public static void main(String[] args) {
		int intValue1 = 56, intValue2 = 42;
		
		System.out.println("\n" + intValue1 + " + " + intValue2 + " = " + (intValue1 + intValue2));
		
		System.out.println("\n" + intValue1 + " - " + intValue2 + " = " + (intValue1 - intValue2));
		
		System.out.println("\n" + intValue1 + " * " + intValue2 + " = " + (intValue1 * intValue2));
		
		System.out.println("\n" + intValue1 + " / " + intValue2 + " = " + (intValue1 / intValue2));
		
		System.out.println("\n" + intValue1 + " / " + intValue2 + " = " + ((double) intValue1 / intValue2));
		
		System.out.println("\n" + intValue1 + " % " + intValue2 + " = " + (intValue1 % intValue2));
		
		System.out.println("\n" + intValue1 + " % " + intValue2 + " = " + ((double) intValue1 % intValue2));
		
		double doubleValue = -3.999999;
		
		long longValue = Math.round(doubleValue);
		
		System.out.println("\n" + doubleValue + " is rounded to " + longValue);
		
		double absoluteValue = Math.abs(doubleValue);
		
		System.out.println("\nabsolute value of " + doubleValue + " = " + absoluteValue);
	}

}
