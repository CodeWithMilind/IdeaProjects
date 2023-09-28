package Date_And_Time;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tut101_DateTimeFormat {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        System.out.println(df);

        String myDate = dt.format(df);
        System.out.println(myDate);

    }
}
