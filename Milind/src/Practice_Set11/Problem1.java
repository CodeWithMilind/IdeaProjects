package Practice_Set11;

abstract class Pen{
    abstract void write(String str);
    abstract void refill(String color);
}

class Cello extends Pen{


    public void write(String str){
        System.out.println(str);
    }


    public void write(String color,String str,String DefaultColor){
        System.out.println(color+str+DefaultColor);
    }

    public void refill(String color){
        System.out.print(color);
    }
}

public class Problem1 {
    public static void main(String[] args) {

        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        Cello p1 = new Cello();
        p1.write("i am a milind");
//        p1.write(RED , "I am red Milind...",RESET);
        p1.refill(RED);
        p1.write("i am a milind");

        p1.refill(GREEN);
        p1.write("i am a milind");

        p1.refill(RESET);
        p1.write("i am a milind");
    }
}
