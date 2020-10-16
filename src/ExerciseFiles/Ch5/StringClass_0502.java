package ExerciseFiles.Ch5;

public class StringClass_0502 {

	public static void main(String[] args) {
		String s1 = "\nthis's a string";
		
		System.out.println(s1);
		
		String s2 = new String("\nthis's also a string");
		
		System.out.println(s2);
		
		String s3 = "\nshirt size: ", s4 = "M", s5 = s3 + s4 + ", quantity: " + 4;
		
		System.out.println(s5);
		
		char[] chars1 = {'h', 'e', 'l', 'l', 'o'};
		
		String s6 = new String(chars1);
		
		System.out.println("\n" + s6);
		
		System.out.println();
		
		char[] chars2 = s6.toCharArray();
		
		for(char ch : chars2) {
			System.out.print(ch);
		}
	}

}
