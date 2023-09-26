package MultiThreading;

class MyThreadRunnale implements Runnable{
    public void run()
    {
        for (int i = 0 ; i <4000;i++){
            System.out.println("i am a thread1");
        }
    }
}
class MyThreadRunnale2 implements Runnable{
    public void run()
    {
        for (int i = 0 ; i <4000;i++){
            System.out.println("i am a thread2");
        }
    }
}

public class Tut71_runnable {
    public static void main(String[] args) {
        MyThreadRunnale bullet1 = new MyThreadRunnale();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnale2 bullet2 = new MyThreadRunnale2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
