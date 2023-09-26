package MultiThreading;
class MyThr extends Thread{
    MyThr(String name){
        super(name);
    }

    public void run(){
//        while (true)
//        {
            System.out.println("I am a thread");
//        }
    }
}
public class Tut73 {
    public static void main(String[] args) {
    MyThr o1 = new MyThr("milind");
    o1.start();
    System.out.println("The id of thread is : "+o1.getId());
    System.out.println("The id of thread is : "+o1.getName());

    }
}
