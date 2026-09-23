import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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