package ExerciseFiles.Ch4;

// converting numeric values

public class ConvertingNumbers_0404 {

	public static void main(String[] args) {
		int intValue_1 = 56;
		
		System.out.println("\nintValue_1: " + intValue_1);
		
		int intValue_2 = intValue_1;
		
		System.out.println("\nintValue_2: " + intValue_2);
		
		long longValue_1 = intValue_1;
		
		System.out.println("\nlongValue_1: " + longValue_1);
		
		short shortValue_1 = (short) intValue_1;
		
		System.out.println("\nshortValue_1: " + shortValue_1);
		
		int intValue_3 = 1024;
		
		byte byteValue = (byte) intValue_3;
		
		System.out.println("\nbyteValue: " + byteValue);
		
		double doubleValue = 3.999999d;
		
		int intValue_4 = (int) doubleValue;
		
		System.out.println("\ndoubleValue -> intValue_4: " + intValue_4);
	}

}
