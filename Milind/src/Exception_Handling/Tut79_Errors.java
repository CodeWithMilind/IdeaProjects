package Exception_Handling;

import java.util.Scanner;

public class Tut79_Errors {
    public static void main(String[] args) {
//        SYNTAX ERROR
//        int a = 0 //Error: No Semicolon;
//        b = 8 ; // Error: b not declared

////        LOGICAL ERRORS
////        write a java program to print all numbers between 1 to 10
//        System.out.println(2);
//        for (int i=1;i<5;i++)
//        {
//            System.out.println(2*i+1);
//        }

        //RUNTIME ERROR
        int k ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        k = sc.nextInt(); // if 0 then ERROR
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);

//        so let's talk about exception , try , catch for handling this exceptional errors

    }
}
