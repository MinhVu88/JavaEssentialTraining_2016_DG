package ExerciseFiles.Ch9;

// create & instantiate a custom class

public class MathHelper_0902 {
	
	public static double add(String x, String y) {
		return Double.parseDouble(x) + Double.parseDouble(y);
	}
	
	public static double minus(String x, String y) {
		double result;
		
		if(Double.parseDouble(x) > Double.parseDouble(y)) {
			result = Double.parseDouble(x) - Double.parseDouble(y);
		}else {
			result = Double.parseDouble(y) - Double.parseDouble(x);
		}
		
		return result;
	}
	
	public static double multiply(String x, String y) {
		return Double.parseDouble(x) * Double.parseDouble(y);
	}
	
	public static double divine(String x, String y) {
		double result;
		
		if(Double.parseDouble(x) > Double.parseDouble(y)) {
			result = Double.parseDouble(x) / Double.parseDouble(y);
		}else {
			result = Double.parseDouble(y) / Double.parseDouble(x);
		}
		
		return result;
	}
}
