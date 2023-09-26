package Tut49;

class Phone{
    public void on()
    {
        System.out.println("Turning on phone.....");
    }
}

class SmartPhone extends Phone
        {
            public void on()
            {
                System.out.println("Turning on smart phone");
            }
        }

public class Tut49 {
    public static void main(String[] args) {

        Phone obj = new SmartPhone(); //reference of superclass & object of subclass

        // for runtime polymorphism {dynamic method dispatch}

        obj.on();  //will run smartphone

    }
}
