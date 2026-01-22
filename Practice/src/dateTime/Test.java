package dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Test {

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
		
		
		
		//Local Date Time
		
		
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
		
		 ZonedDateTime now = ZonedDateTime.now();
		 
		 System.out.println(now); //2026-01-22T10:28:14.082869600+05:30[Asia/Calcutta]
		
		 Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		 
//		 for(String s : availableZoneIds) {  //24 are main
//			 System.out.println(s);
//		 }
		 
		 ZonedDateTime americaTime = ZonedDateTime.of(2000, 12, 3, 4, 32, 45, 30, ZoneId.of("America/Dawson_Creek"));
		 System.out.println(americaTime);
		 
		 
		ZoneId zone = americaTime.getZone();
		
		System.out.println(zone);
		
		
	}
}
