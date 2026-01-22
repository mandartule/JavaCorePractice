package dateTime;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TestDateClass {

	public static void main(String[] args) {
		
		//Local Date-----------------------
		
		
//		LocalDate now = LocalDate.now();
//		System.out.println(now);
//		
//		LocalDate customDate = LocalDate.of(2004, 3, 5);
//		System.out.println(customDate);
//		
//		int dayOfMonth = now.getDayOfMonth();
//		int monthValue = now.getMonthValue();
//		int year = now.getYear();
//		
//		
//		LocalDate today = LocalDate.now();
//		
//		LocalDate yesterday = today.minusDays(1);
//		LocalDate pastDate = today.minusMonths(100);
//		
//		if(today.isAfter(yesterday)) {
//			System.out.println("Yes true");
//		}
//		
		
		
		
		//Local time ----------------------------
		
//		LocalTime now = LocalTime.now();
//		System.out.println(now);
//		
//		now.getHour();
//		now.getMinute();
//		 
//		LocalTime customTime = LocalTime.of(14,20,53);
//		
//		//now we can use all the time methods on parsed time	
//		LocalTime parsedTime = LocalTime.parse("15:30:45");
//		
//		LocalTime minusMinutes = now.minusMinutes(20);
//		
//		if(now.isAfter(minusMinutes)) {
//			System.out.println("yes");
//		}
//		
//		System.out.println(minusMinutes);
		
		
		
		//Local Date Time ---------------------------------------------------
		
		
//		LocalDateTime now = LocalDateTime.now();
//		
//		//here T is a separator
//		System.out.println(now); //2026-01-22T10:22:06.784448400
//		
//		LocalDateTime.of(2022, 2, 3, 4, 55, 3, 0);
//		
//		LocalDateTime myDateTime = LocalDateTime.parse("2023-01-11T14:52");
//		
//		
		
		
		//Zoned Date Time
		
//		 ZonedDateTime now = ZonedDateTime.now();
//		 
//		 System.out.println(now); //2026-01-22T10:28:14.082869600+05:30[Asia/Calcutta]
//		
//		 Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//		 
////		 for(String s : availableZoneIds) {  //24 are main
////			 System.out.println(s);
////		 }
//		 
//		 ZonedDateTime americaTime = ZonedDateTime.of(2000, 12, 3, 4, 32, 45, 30, ZoneId.of("America/Dawson_Creek"));
//		 System.out.println(americaTime);
//		 
//		 
//		ZoneId zone = americaTime.getZone();
//		
//		System.out.println(zone);
//		
//		//and all others common is after, is before
		
		
		
		
		//Instant -----------------------------------
		
//		//at older time
//		long timeMillis = System.currentTimeMillis();
//		System.out.println(timeMillis); //1769059460227 milliseconds from 1 jan 1970 utc
//		
//		Instant now = Instant.now();
//		System.out.println(now); //2026-01-22T05:25:41.297557200Z this is a instant here Z means UTC
//		
//		
		
		
		
		//Duration -----------------------------------------
		
//		//time between 2 points
//		
//		Instant start = Instant.now();
//		
//		int sum = 0;
//		
//		for(int i = 0; i<1000000; i++) {
//			sum+=i;
//		}
//		
//		Instant end = Instant.now();
//		
//		
//		Duration d1 = Duration.between(start, end);
//		Duration d2 = Duration.ofHours(1);
//		
//		System.out.println(d1); //PT0S  here P means period
//		//PT0.0020034S after for loop
//		
//		System.out.println(d2); //PT1H
//		
//		int compareTo = d1.compareTo(d2);
//		System.out.println(compareTo); //-1 as the d1 is smaller than d2
//		
//		long hours = d2.toHours();
//		System.out.println(hours); // 1
//		
//		LocalDate a = LocalDate.now();
//		LocalDate b = LocalDate.now();
//		
//		Duration.between(a, b); //this will give error because local date do not time
		
		
//		//period---- for long durations
//		
//		LocalDate now = LocalDate.now();
//		LocalDate then = LocalDate.of(1990, 2, 3);
//		
//		Period period = Period.between(now, then);
//		System.out.println(period);//P-35Y-11M-19D		/
//		
//		period.ofDays(0);
//		
//		
		
		
		
		//DateTimeFormator ---------------------------
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime ldtParsed = LocalDateTime.parse("2026-01-22T11:13:02.749116700");
		System.out.println(ldtParsed);
		
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(format);
		
		String date = "25/04/1998";
		
		LocalDate parsedDate = LocalDate.parse(date,format);
		System.out.println(parsedDate);
		
		/*
		 * year - y
		 * Month - M
		 * minute - m
		 */
		
		String dateTimeString = "2023-04-24 10:30:45 IST";
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z") ;
		
		ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString, formatter);
		
		System. out.println(zonedDateTime);

		
		
		
		
	}
	
}
