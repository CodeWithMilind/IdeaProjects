package Date_And_Time;

import java.util.Date;

public class Tut97_Date {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
//        System.out.println(Long.MAX_VALUE/1000/3600/24/365);

        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getYear()+1900);
//        System.out.println(d.getDay());

            System.out.print(d.getHours() + " ");
            System.out.print(d.getMinutes() + " ");
            System.out.println(d.getSeconds() + " ");


    }
}
