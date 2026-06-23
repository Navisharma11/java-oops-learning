//import java.util.Date;

import java.sql.Date;

public class LaunchDate1
{
    public static void main(String[] args)
    {
        // Date --> util , Sql

        //Java 8 --> joda api --> new date time api --> time package

//        Date date = new Date();//Date class of util package will return both date and timme
//        System.out.println(date);
//
//        int year = date.getYear();
//        System.out.println(year);
//        long timeInMs = date.getTime();
//        System.out.println(timeInMs);
//
        long timeInMs = 1782217424745L;
        Date date = new Date(timeInMs);
        System.out.println(date);//return only Date



    }

}
