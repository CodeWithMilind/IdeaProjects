package Exception_Handling;

import java.util.Scanner;

public class Tut81
{
        public static void main(String []args){
                int [] marks = new int [3];
                marks[0] =67;
                marks[1] =36;
                marks[2] =45;
//                marks[3] =56;      //error --> out of size

                System.out.println("Enter the index of array");
                Scanner sc = new Scanner(System.in);

                try {
                    int index = sc.nextInt();
                    System.out.println(marks[index]);
                } catch (Exception e) {
                    System.out.println(e);
                }
        }

}
