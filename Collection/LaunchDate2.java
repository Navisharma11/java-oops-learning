import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LaunchDate2
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int dayOfMonth = date.getDayOfMonth();
        int dayOfYear = date.getDayOfYear();
        System.out.println("Day os year is "+dayOfYear);
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(dayOfMonth + " / " + month + " / " + year);

        LocalDate dob = LocalDate.of(1994,3,8);
        System.out.println(dob);
        System.out.println("**************************");
        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour = time.getHour();
        int minutes = time.getMinute();
        int seconds = time.getSecond();
        int nanoSec = time.getNano();
        System.out.println(hour + " hour " + minutes  +" minutes " + seconds + " seconds " + nanoSec + " nanoSeconds ");

        System.out.println("**************************");
        LocalDateTime timeDate = LocalDateTime.now();
        System.out.println(timeDate);


    }
}
