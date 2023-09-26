package AccessModifiers;

//Modifier        class   package   subclass   world

//Public            Y       Y         Y          Y
//Protected         Y       Y         Y          N
//Default(no)       Y       Y         N          N
//Private           Y       N         N          N

class Test{
    int i = 1;
    public int pb = 5;
    private int pr = 7;
    protected int pro = 9;
    public void see(){
        System.out.println(i);
        System.out.println(pb);
        System.out.println(pr);
        System.out.println(pro);
    }

}
public class AccessMod {
    public static void main(String[] args) {

        Test o1 = new Test();

       System.out.println( o1.i);
        System.out.println(o1.pb);
//        System.out.println(o1.pr); ---> Error
        System.out.println(o1.pro);
    }
}
