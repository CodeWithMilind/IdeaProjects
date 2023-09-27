package Exception_Handling;
class First{
    public void run(){
        //Logical Error
//        int a = 8
//        a = 6;


        //runtime Error
//        System.out.println(7/0);
    }
}

class Second{
    Second(){
        try {
            int a = 8/0;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("haha");
        }
        catch(ArithmeticException e)
        {
            System.out.println("hehe");
        }
    }
}

class Third{
    Third(){

    }
}
public class Practice_Set15 {
    public static void main(String[] args) {
        Second Problem2 = new Second();

    }
}
