package inheritances.interfacess;
//Do Not repeat yourself { DRY Principle    }

interface parent{
    void meth2();
    void meth1();
    void meth5();
}

interface child extends parent{
//    void meth1();
//    void meth2();

    void meth4();
    void meth3();

    @Override
    default void meth1() {
        System.out.println("Default meth1");
    }

    @Override
    default void meth2() {
        System.out.println("Default meth2");
    }

}

class Sample implements child{
   public void meth3(){
        System.out.println("meth3");
    }

    public void meth4(){
         System.out.println("meth4");

    }

    public void meth5(){
         System.out.println("meth5");

    }


}

public class InheritanceInterfaces {
    public static void main(String[] args) {
        Sample sample = new Sample();

        sample.meth1();
        sample.meth2();
        sample.meth3();
        sample.meth4();
        sample.meth5();
    }
}
