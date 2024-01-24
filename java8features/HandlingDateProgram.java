package java8features;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class HandlingDateProgram {

	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		System.out.println("Current Date: "+currentDate);
		
		LocalTime currentTime=LocalTime.now();
		System.out.println("Current Time: "+currentTime);
		
		LocalDateTime currentDateTime=LocalDateTime.now();
		System.out.println("Current DateTime: "+currentDateTime);
		
		LocalDate date=LocalDate.parse("2000-09-02");//setting date by passing strings
		System.out.println("Date: "+date);
		
		LocalDate date2=LocalDate.of(2002,03,29);//setting date by passing integer
		System.out.println("Date: "+date2);
		//retrieving yesterday and tomorrow date
		LocalDate yesterday=currentDate.minusDays(1);
		System.out.println("Yesterday Date: "+yesterday);
		
		LocalDate tomorrow=currentDate.plusDays(3);
		System.out.println("Tomorrow Date: "+tomorrow);
		
		//is leap year
		System.out.println("is Leap Year: "+currentDate.isLeapYear());
		
		//changing date time format
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate=currentDateTime.format(formatter);
		System.out.println("Date(dd-MM-yyyy) Format: "+formattedDate);
		
		//handling zones
		ZonedDateTime zonedDate=ZonedDateTime.now();
		System.out.println("Date with Zone: "+zonedDate);
		System.out.println("Current Zone: "+zonedDate.getZone());
		
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		
		ZonedDateTime tokyoZone=zonedDate.withZoneSameInstant(tokyo);
		System.out.println("Date(tokyo zone): "+tokyoZone);

	}

}
