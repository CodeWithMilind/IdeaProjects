package Exception_Handling.Finaly_Block;

public class Tut85_Finally_Block {
    public static int greet()
    {
      try{
          int a = 6;
          int b = 2;
          return  a/b;
      }catch (Exception e)
      {
          System.out.println(e);
      }
      finally { // it will, must run
          System.out.println("This is The End of The Program");
      }
      return 0;
    }
    public static void main(String[] args) {
        System.out.println(greet());
        System.out.println();
        int a = 7 , b = 9;
        while(true)
        {
            try{
                System.out.println(a/b);
            }
            catch (Exception e)
            {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for b : "+b);
                b--;
            }
        }

        try{
            System.out.println(6/10);
//            System.out.println(6/0);
        }finally {
            System.out.println("Try With Finally's Exception");
        }


    }
}
