package Exception_Handling;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "i am to String()";
    }

    @Override
    public String getMessage() {
        return "i am getMessage()";
    }
}
public class Tut83_Exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 9)
        {
            try{
                throw new MyException();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();  //it will print on Screen in Red Color
                System.out.println("Finished");

            }
        }
    }
}
