//Tum aam khao or ghutlia matt gino

// abstraction is a process of hidding internal data &
// showing external data to the user

package Abstraction;

abstract class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
    public void sayHii(){
        System.out.println("Hii");
    }

    abstract public void greet();               //Main Logic is Here
}

class child extends Parent{
    @Override
    public void greet() {
        System.out.println("Good morning. Bacchho!");
    }
}
public class Abstract {
    public static void main(String[] args) {
        child m = new child();
       // Parent a = new Parent();  // ----> we can't make obj of abstract class

        //i used inteliJIdea Snipit so i made that
        Parent b = new Parent() {
            @Override
            public void greet() {
                System.out.println("Parents object's Greet Function...");
            }
        };

    }
}
