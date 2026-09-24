package intro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo{
    public static void main(String[] args){
        Date date = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        String current_time = dateFormat.format(date);
        System.out.println(current_time);

        String str = String.format("%tc\n", date);
        System.out.printf(str);

        String curTime = date.toString();
        System.out.print(curTime);
        System.out.print("\nHello World\n");

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.print(input + " Parse as ");

        Date t;
        try {
            t = fmt.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparsable using: " + fmt);
        }
    }
}

class SleepDemo{
    public static void main(String[] args){
        try{
//        System.out.println(new Date() + "\n");
//        Thread.sleep(5 * 60 * 10);
//        System.out.println(new Date() + "\n");

            long start = System.currentTimeMillis();
            System.out.println(new Date());

            Thread.sleep(5 * 60 * 10);
            System.out.println(new Date());

            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Difference in milliseconds is : " + diff);
        } catch (Exception e){
            System.out.println("Got an exception");
        }
    }
}

class GregorianCalenderDemo{
    public static void main(String []args){
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        GregorianCalendar calender = new GregorianCalendar();
        System.out.print("Date: ");
        System.out.print(months[calender.get(Calendar.MONTH)]);
        System.out.print(" "+ calender.get(Calendar.DATE) + " ");
        System.out.println(calender.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(calender.get(Calendar.HOUR) + ":");
        System.out.print(calender.get(Calendar.MINUTE) + ":");
        System.out.print(calender.get(Calendar.SECOND));

        System.out.println();
        if (calender.isLeapYear(Calendar.YEAR)){
            System.out.println("The current year is a leap year");
        } else {
            System.out.println("The current year is not a leap year");
        }

    }
}