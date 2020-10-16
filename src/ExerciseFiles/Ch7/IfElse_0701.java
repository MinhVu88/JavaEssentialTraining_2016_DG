package ExerciseFiles.Ch7;

public class IfElse_0701 {

	public static void main(String[] args) {
		//int monthNo = 8;
		
		int monthNo = 13;
		
		if(monthNo >= 1 && monthNo <= 3) {
			System.out.println("\nyou're in quarter 1");
		}else if(monthNo >= 4 && monthNo <= 6) {
			System.out.println("\nyou're in quarter 2");
		}else if(monthNo >= 7 && monthNo <= 9) {
			System.out.println("\nyou're in quarter 3");
		}else if(monthNo >= 10 && monthNo <= 12) {
			System.out.println("\nyou're in quarter 4");
		}else {
			System.out.println("\nan unknown month");
		}
	}

}
