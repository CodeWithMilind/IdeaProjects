package Tut61;

import java.util.Scanner;

class Library{
    Scanner sc = new Scanner(System.in);
    private String []books;
   private int no_of_books;

    Library()
    {
        this.books = new String[100];
        this.no_of_books=0;
    }

    void addBook(String book)
    {
        this.books[no_of_books]=book;
        no_of_books++;
//        System.out.println("Added book : "+book        );
    }

    void showBook()
    {int iforBook = 0;

        for (String e:books)
        {
            if (e==null)
            {
                break;
            }
            if (e!="")
            {
                System.out.print(iforBook +"."+e+"  ");
                iforBook++;
            }
        }
        iforBook=0;
        System.out.println();
    }

    void removeBook(String book)
    { int i = 0;
       for (String e : this.books){
           if (e == book)
           {
               books[i++]="";
               System.out.println("Removed Book "+book);
           }

       }

    }




    void ask()
    {
        System.out.println("1.Add Book\t2.Remove Book\t3.Show Books");
        System.out.print("Press : ");
        int q = sc.nextInt();

        if (q==1)
        {
            System.out.print("Enter Book Name, which you want to add : ");
            String bookName = sc.next();
            addBook(bookName);
            System.out.println("Added Book "+bookName);
        }

        else if (q==2)
        {
            System.out.print("Enter Book NAME, which you want to Remove : ");
            showBook();
            String bN;
            bN = sc.next();
            removeBook(bN);


        }

        else if (q==3)
        {
         showBook();
        }

        else {
            System.out.println("No Cmd Found");
        }
    }
}
public class Exersise4 {
    public static void main(String[] args) {
        Library mj = new Library();
//        mj.addBook("Marathi");
//        mj.addBook("Hindi");
//        mj.addBook("English");
//        mj.addBook("Profit");
//        mj.showBook();
//        mj.removeBook("English");
//        mj.showBook();





    }
}
