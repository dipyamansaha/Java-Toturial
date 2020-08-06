package java_dates;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Java_ZonedDateTime {

	public static void main(String[] args) {

		// Get Current Date Time of Zone
		ZonedDateTime dateTime = ZonedDateTime.now();
		System.out.println(dateTime);

		// Get Date Time Using ZoneId
		ZoneId id = ZoneId.of("UTC+05:30");
		ZonedDateTime dateTime2 = ZonedDateTime.now(id);
		System.out.println(dateTime2);

		// With Argument
		Date date = new Date(1); 
		System.out.println(date); // Thu Jan 01 05:30:00 IST 1970
		
		// Without Argument
		Date date2 = new Date(); 
		System.out.println(date2); // Current time

		// Now Format the Date and Time Using SimpleDateTimeFormat
		SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy HH:mm:ss.SSSZ");

		System.out.println(format.format(date2));

	}

}
// DateTime Pattern : 

//dd-MM-yy	    					31-01-12
//dd-MM-yyyy						31-01-2012
//MM-dd-yyyy						01-31-2012
//yyyy-MM-dd						2012-01-31
//yyyy-MM-dd HH:mm:ss				2012-01-31 23:59:59
//yyyy-MM-dd HH:mm:ss.SSS			2012-01-31 23:59:59.999
//yyyy-MM-dd HH:mm:ss.SSSZ			2012-01-31 23:59:59.999+0100
//EEEEE MMMMM yyyy HH:mm:ss.SSSZ	Saturday November 2012 10:45:42.720+0100
