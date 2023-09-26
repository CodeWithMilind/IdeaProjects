package MultiThreading.Praccticeset;
class Th extends Thread {

    public void run()
    {
//        while(true)
        {
            System.out.println("Good Morning");
        }
    }
}
class Th2 extends Thread {

    public void run()
    {
//        while(true)
        {
            //  problem 2
//            try {
//                Thread.sleep(400);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("Welcome");
        }
    }
}

public class First {
    public static void main(String[] args) {
        Th t1 = new Th();
        Th2 t2 = new Th2();


        t1.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());

        t2.start();
        System.out.println(t2.getState());
    }
}
