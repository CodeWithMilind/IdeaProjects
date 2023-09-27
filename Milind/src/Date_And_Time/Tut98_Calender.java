package Date_And_Time;

//Calendar class is an abstract class
import java.util.Calendar;
import java.util.TimeZone;

public class Tut98_Calender {
    public static void main(String[] args) {
        Calendar Cal = Calendar.getInstance();
        Calendar AsiaCal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(Cal.getCalendarType());
        System.out.println(Cal.getTimeZone());
        System.out.println(Cal.getTimeZone().getID());
        System.out.println(AsiaCal.getTimeZone().getID());

    }
}
