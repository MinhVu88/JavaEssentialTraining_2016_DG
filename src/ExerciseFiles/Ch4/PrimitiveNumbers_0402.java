package ExerciseFiles.Ch4;

// declare & initialize numeric primitives 

public class PrimitiveNumbers_0402 {

	public static void main(String[] args) {
		byte b0 = 1;
		
		short sh = 1;
		
		int i = 1;
		
		long l = 1l;
		
		float f = 1f;
		
		double d = 1d;
		
		System.out.println("\nByte #0: " + b0);
		System.out.println("Short: " + sh);
		System.out.println("Int: " + i);
		System.out.println("Long: " + l);
		System.out.println("Float: " + f);
		System.out.println("Double: " + d);
		
		byte b1 = 127;
		
		System.out.println("\nb1: " + b1);
		
		//b1++;
		
		//System.out.println("\nByte #1++: " + b1);
		
		if(b1 < Byte.MAX_VALUE) {
			b1++;
		}
		
		System.out.println("\nb1: " + b1);
	}

}
