package Interfacess;
//default function called to 21 line
interface Camera{
    void takesnap();
   default void sendsnap()
   {
       System.out.println("Sending snap...");
   }

   private void greet(){
       System.out.println("Secret msg is 'Jarvis'...");
   }
    //private method calling

    default void secret()
    {
        greet();
    }

}

interface Network{
    void callNumber(long number);
}

class SmartPhone implements Camera,Network{

   public void takesnap(){
        System.out.println("Taking Snap");
    }

    //default Function
    public void sendsnap(){
        System.out.println("Sending snap to everyone");
    }
    public void callNumber(long number){
        System.out.println("Calling To : "+number);
    }


}
public class RealEx {
    public static void main(String[] args) {
    SmartPhone Asus = new SmartPhone();
    Asus.takesnap();
    Asus.callNumber(8530871762L);
    Asus.sendsnap();
//    Asus.greet();    ---> throw error
    Asus.secret();
    }
}
