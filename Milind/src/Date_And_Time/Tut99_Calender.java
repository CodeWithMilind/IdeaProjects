package Date_And_Time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tut99_Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.MILLISECOND));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2023));
    }
}
