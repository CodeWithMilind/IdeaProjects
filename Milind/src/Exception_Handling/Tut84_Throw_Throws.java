package Exception_Handling;
class NegativeRadiusException extends  Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}
public class Tut84_Throw_Throws {

    public static double area(int r) throws NegativeRadiusException{
        if (r<0)
        {
            throw new NegativeRadiusException();
        }

        double result = Math.PI * r * r ;
        return result;
    }
    public static int divide(int a , int b ) throws ArithmeticException {
         int result = a/b;
         return result;
     }

    public static void main(String[] args) {
        try{
//            int c = divide(6,0);
//            System.out.println(c);

            System.out.println(area(-4));

        }
        catch(Exception e){
            e.getMessage();
            System.out.println("Exception");
        }

    }
}
