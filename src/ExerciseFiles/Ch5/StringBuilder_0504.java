package ExerciseFiles.Ch5;

import java.util.Scanner;

// build a string from multiple values

public class StringBuilder_0504 {

	public static void main(String[] args) {
		String str1 = "hello", str2 = "world", str3 = str1 + ", " + str2 + "!";
		
		System.out.println("\n" + str3);
		
		StringBuilder sb1 = new StringBuilder("hello");
		
		sb1.append(", ");
		
		sb1.append("world");
		
		sb1.append("!");
		
		System.out.println("\n" + sb1);
		
		StringBuilder sb2 = new StringBuilder("I").append(" am").append(" from").append(" the").append(" future");
		
		System.out.println("\n" + sb2);
		
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter a value: ");
		
		String input = kbi.nextLine();
		
		System.out.println("\nuser/keyboard input: " + input);
		
		System.out.println();
		
		sb2.delete(0, sb2.length());
		
		for (int i = 0; i < 3; i++) {
			sb2.append(kbi.nextLine() + " ");
		}
		
		System.out.print("\n" + sb2);
		
		kbi.close();
	}

}
