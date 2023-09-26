package Exception_Handling;

import java.util.Scanner;

public class Tut82_NestedTryCatch {
    public static void main(String[] args) {
        int []marks = new int [3];
        marks[0] = 65;
        marks[1] = 52;
        marks[2] = 33;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Index : ");
        int index = sc.nextInt();

        try{
            System.out.println("Welcome to 82th Program");
            try{
                System.out.println(marks[index]);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Sorry this index not available");
                System.out.println("Exception level 2");
            }

        }
        catch (Exception e)
        {
            System.out.println("Exception in level 1");
        }
    }
}
