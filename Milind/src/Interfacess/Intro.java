package Interfacess;

interface Bicycle{
    void speedUp(int increment);
    void speedDown(int decrement);
}
// SPOILER --->>> We can make a new class by using multiple interfaces

// "interfaces JAVA docs" Google it

/* class Hercules implements Bicycle{
    int speed = 7 ;
    void applyBreak(int decrement)
    {
        speed = speed - decrement;
    }

    void speedUpp(int increment){
        speed = speed + increment;
    }
}
*/

public class Intro {
    // That is the Example Program
    public static void main(String[] args) {
        System.out.println("It is an example");
    }
}


//interface is like class- but, but, but,
// we can't make object of interface and we can be make reference for that