package ExerciseFiles.Ch7;

import java.util.Scanner;

public class Switch_0702 {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter a number: ");
		
		String input = kbi.nextLine();
		
		int monthNo = Integer.parseInt(input);
		
		switch (monthNo) {
		case 1:
			System.out.println("\nJanuary");
			break;
		case 2:
			System.out.println("\nFebruary");
			break;
		case 3:
			System.out.println("\nMarch");
			break;
		case 4:
			System.out.println("\nApril");
			break;
		case 5:
			System.out.println("\nMay");
			break;
		case 6:
			System.out.println("\nJune");
			break;
		case 7:
			System.out.println("\nJuly");
			break;
		case 8:
			System.out.println("\nAugust");
			break;
		case 9:
			System.out.println("\nSeptember");
			break;
		case 10:
			System.out.println("\nOctober");
			break;
		case 11:
			System.out.println("\nNovember");
			break;
		case 12:
			System.out.println("\nDecember");
			break;
		default:
			System.out.println("\nan unknown month");
			break;
		}
		
		System.out.print("\nenter the 1st 3 letters of a month with the 1st one being uppercase: ");
		
		String abbreMonth = kbi.nextLine();
		
		switch (abbreMonth) {
		case "Jan":
			System.out.println("\nmonth #1");
			break;
		case "Feb":
			System.out.println("\nmonth #2");
			break;
		case "Mar":
			System.out.println("\nmonth #3");
			break;
		case "Apr":
			System.out.println("\nmonth #4");
			break;
		case "May":
			System.out.println("\nmonth #5");
			break;
		case "Jun":
			System.out.println("\nmonth #6");
			break;
		case "Jul":
			System.out.println("\nmonth #7");
			break;
		case "Aug":
			System.out.println("\nmonth #8");
			break;
		case "Sep":
			System.out.println("\nmonth #9");
			break;
		case "Oct":
			System.out.println("\nmonth #10");
			break;
		case "Nov":
			System.out.println("\nmonth #11");
			break;
		case "Dec":
			System.out.println("\nmonth #12");
			break;
		default:
			System.out.println("\nan unknown month");
			break;
		}
		
		kbi.close();
	}

}
