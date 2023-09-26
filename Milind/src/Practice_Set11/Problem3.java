package Practice_Set11;
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("eating...");
    }

}

class Human extends Monkey implements BasicAnimal{
    public void eat()
    {
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("sleeping...");
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Human milind = new Human();
        milind.eat();

    }
}
