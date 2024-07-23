package localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class TestLocalDateTime {

	public static void main(String[] args) {

		// default format: yyyy-MM-dd-HH-mm-ss.zzz

		// Current Date
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Current DateTime=" + today);

		// Current Date using LocalDate and LocalTime
		today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Current DateTime=" + today);

		// Creating LocalDateTime by providing input arguments
		LocalDateTime lunchDate = LocalDateTime.of(2018, Month.JULY, 18, 1, 30, 30);
		System.out.println("Amidst Lunch=" + lunchDate);

		// Getting Stuff from Zurich
		LocalDateTime todayZurich = LocalDateTime.now(ZoneId.of("Europe/Rome"));
		System.out.println("Current Date Time in Zurich=" + todayZurich);

	}

}