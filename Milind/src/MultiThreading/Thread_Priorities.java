package MultiThreading;

class MyThr1 extends Thread{
    MyThr1(String name){
        super(name);

    }
    public void run(){
        while(true)
        {


                    System.out.println("i am thread : "+getName());


        }
    }
}
public class Thread_Priorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("milind1");
        MyThr1 t2 = new MyThr1("milind2");
        MyThr1 t3 = new MyThr1("milind3");
        MyThr1 t4 = new MyThr1("milind4");
        MyThr1 t5 = new MyThr1("milind5");

        t4.setPriority(Thread.MAX_PRIORITY);  //Max Priority
        //
        t1.setPriority(Thread.MIN_PRIORITY);  //Min
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
