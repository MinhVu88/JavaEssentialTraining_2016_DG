package ExerciseFiles.Ch4;

import java.math.BigDecimal;

// represent currency values with BigDecimal

public class Currency_0403 {

	public static void main(String[] args) {
		double value = .012;
		
		System.out.println("\na Double value: " + value);
		
		double primitiveSum = value + value + value;
		
		System.out.println("\n" + value + " + " + value + " + " + value + " = " + primitiveSum + " (inaccurate)");
		
		System.out.println("\nthe String representation of the Double value: " + Double.toString(value));
		
		BigDecimal bigValue = new BigDecimal(Double.toString(value));
		
		BigDecimal decimalSum = bigValue.add(bigValue).add(bigValue);
		
		System.out.println("\nthe sum of the Double primitives after wrapping the String representation"
				+ " in a BigDecimal object & adding the objects together: " + decimalSum.toString() + " (accurate)");
	}

}
