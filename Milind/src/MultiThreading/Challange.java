package MultiThreading;


class MyThreadRunnable0 extends Thread implements Runnable{

    MyThreadRunnable0(String name){
        super(name);
    }

    public void run()
    {
//        for (int i = 0 ; i <4000;i++){
            System.out.println("i am a thread1");
//        }
    }
}


public class Challange {
    public static void main(String[] args) {
        MyThreadRunnable0 bullet1 = new MyThreadRunnable0("milind");
        Thread gun1 = new Thread(bullet1);

        gun1.start();
        System.out.println(bullet1.getName()+" "+bullet1.getId());
    }
}

