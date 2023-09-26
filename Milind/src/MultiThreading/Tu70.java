package MultiThreading;

class MyThread extends Thread{
    public void run()
    {
        int i = 0 ;
        while (i<4000)
        {
            System.out.println("eating....");
            System.out.println("i am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run()
    {
        int i = 0 ;
        while (i<4000)
        {
            System.out.println("cooking....");
            System.out.println("i am sad");
            i++;
        }
    }
}

public class Tu70 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();  //multitasking
        t2.start();
    }
}
