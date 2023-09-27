package Date_And_Time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Tut100_Java_Time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);
    }
}
