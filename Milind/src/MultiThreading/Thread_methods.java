package MultiThreading;

class MyThre1 extends Thread{
    MyThre1(String n){super(n);}
    public void run()
    {int i = 0;
        while(i<4000)
        {
            System.out.println("hello "+getName());i++;
        }
    }
}

public class Thread_methods {
    public static void main(String[] args) {
        MyThre1 t1 = new MyThre1("milind");
        MyThre1 t2 = new MyThre1("Chaudhari");
        t1.start();

//        t1.join();
        try{
            t1.join();
        }
        catch(Exception e)
            {
                System.out.println(e);
            }

        t2.start();

    }
}
