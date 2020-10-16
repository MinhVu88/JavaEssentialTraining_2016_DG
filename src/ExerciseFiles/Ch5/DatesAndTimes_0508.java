package ExerciseFiles.Ch5;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesAndTimes_0508 {

	public static void main(String[] args) {
		// the old API
		Date d1 = new Date();
		
		System.out.println("\n" + d1);
		
		GregorianCalendar gc = new GregorianCalendar(2019, 3, 19); // 2019 - 4 - 19 (months: 0 - 11)
		
		gc.add(GregorianCalendar.DATE, 1); // 2019 - 4 - 20
		
		Date d2 = gc.getTime();
		
		System.out.println("\n" + d2);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println("\n" + df.format(d2));
		
		// the new API (Java 8 onwards)
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println("\n" + ldt);
		
		LocalDate ld = LocalDate.of(2019, 3, 19); // 2019 - 3 - 19 (months: 1 - 12)
		
		System.out.println("\n" + ld);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ISO_DATE;
		
		System.out.println("\n" + dtf1.format(ld));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("M/d/yyyy");
		
		System.out.println("\n" + dtf2.format(ld));
	}

}
