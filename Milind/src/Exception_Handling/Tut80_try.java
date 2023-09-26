package Exception_Handling;

public class Tut80_try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        //without try
//        System.out.println(a/b);  //last sout will not run when i use without try ( program will crash )

        //with try
        try{
             System.out.println(a/b);
        }
        catch(Exception e){
            System.out.print("We failed to divide. Reason: ");
            System.out.println(e);
        }

        System.out.println("Ending of the program");

    }
}
