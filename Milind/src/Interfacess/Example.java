package Interfacess;

interface bicycle{
    final int a = 46;

    default void speedup(int increment) {

    }

    default void speeddown(int decrement){}
}

interface Car{
    int speed = 40;
    void fly();
    void swim();

}

class hercules implements bicycle{
    public void speedup(int increment){
        System.out.println("Applying Speed");
    }

    public void speeddown(int decrement)
    {
        System.out.println("Applying Brake");
    }
}

class Mercedes implements Car , bicycle{  int t = 0;
    public void fly(){
        System.out.println("Mercedes is Flying...");
    }

    public void swim(){
        System.out.println("Mercedes is swiming...");

    }
    public void whatspeed(){

        if (t==0){
            System.out.println("Speed is : "+ speed);
        }
        else{
            System.out.println("Speed is : "+ sp);

        }
    }
//    public void setspeed(int s){
//        speed = s; //--> we cant modify properties of interfaces bcz the value of interfaces variabe is final;
//    }

    int sp = speed;
    public void setSpeed(int s)
    {
        t = 1;
        sp = s;
    }


    //bycicle functions have must use bcz of implementation edited--> else i have to usedefault keyword
//    @Override
//    public void speedup(int increment) {
//
//    }
//
//    @Override
//    public void speeddown(int decrement) {
//
//    }



}

public class Example {
    public static void main(String[] args) {
        hercules m = new hercules();
        m.speeddown(2);
        System.out.println(m.a);

        /////////////////////////////////
        Mercedes milind = new Mercedes();
        milind.fly();
        milind.swim();
        milind.whatspeed();


//        milind.setSpeed(120);
//        milind.whatspeed();

    }
}
