package basic2;

import java.time.*;

public class DateAndTimeExample {


    public static void main(String[] args) {

        //LocalTime

        /*LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Now is " +localTime);

        LocalTime localTime2 = LocalTime.now().withHour(0).withNano(0).withSecond(0);
        System.out.println("Now is " +localTime2);
        System.out.println(localTime.getHour() + "/" + localTime.getMinute());

        localTime = localTime.plusMinutes(15);
        System.out.println("Break until " +localTime);
        System.out.println(Duration.between(localTime,localTime2));
        */


        //LocalDate

        /*LocalDate localDate = LocalDate.now();
        System.out.println("Today is " +localDate);
        System.out.println("Year " + localDate.getYear());
        System.out.println("Day of the week " +localDate.getDayOfWeek());
        System.out.println("Day of the year " +localDate.getDayOfYear());
        System.out.println("Week of the year " + localDate.getDayOfYear() / 7);

        LocalDate localDate1 = LocalDate.of(2019,03,11);
        System.out.println(localDate1);

        LocalDate covidStartDate = localDate.of(2019, Month.DECEMBER, 11);
        System.out.println("Covid started " +covidStartDate);

        System.out.println(Period.between(localDate,covidStartDate));
        */


        //LocalDateTime

        LocalDateTime localDateTime = LocalDateTime.now().withNano(0);
        System.out.println(localDateTime);

        LocalDateTime firstInternationalCatsDay = localDateTime.of(1997,11,20,10,45,45);
        System.out.println("International Cat's day was started on " +firstInternationalCatsDay);
    }
}
