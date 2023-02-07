package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeApi {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		
		LocalDate of = LocalDate.of(2015, 02, 20);		
		LocalDate of1 = LocalDate.of(2015, Month.FEBRUARY, 25);
		
		LocalDate parse = LocalDate.parse("2015-02-20");
		
		LocalTime now = LocalTime.now();
		
		LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
		
		System.out.println(localDate);
		System.out.println(localDateTime);

	}

}
