package ExerciseFiles.Ch8;

public class MultiArrays_0802 {

	public static void main(String[] args) {
		String[][] countryCapital = new String[3][2];
		
		countryCapital[0][0] = "Japan";
		
		countryCapital[0][1] = "Tokyo";
		
		countryCapital[1][0] = "Germany";
		
		countryCapital[1][1] = "Berlin";
		
		countryCapital[2][0] = "The U.S";
		
		countryCapital[2][1] = "Washington D.C";
		
		for (int i = 0; i < countryCapital.length; i++) {
			StringBuilder sb = new StringBuilder();
			
			sb.append("\nthe capital city of ").append(countryCapital[i][0]).append(": ").append(countryCapital[i][1]);
			
			System.out.println(sb);
		}
		
	}

}
