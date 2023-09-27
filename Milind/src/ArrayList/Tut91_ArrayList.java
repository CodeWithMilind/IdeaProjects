package ArrayList;
import java.util.*;
public class Tut91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        {
        l2.add(43);
        l2.add(433);
        l2.add(4333);
        l2.add(4333);
        }
        {
            l1.add(18);
            l1.add(41);
            l1.add(14);
            l1.add(13);
        }

//        System.out.println(l1);

        for (int e : l1)
        {
            System.out.println(e);
        }
      ///////////////////////////
        System.out.println();
        l1.add(2,999);
        l1.remove(4);


        for (int e : l1){
            System.out.println(e);
        }

//        System.out.println(l1.get(1));  // -> instead of l1[1];

//        l1.addAll(l2); //-> Without index
        l1.addAll(0,l2); //-> With Index
        System.out.println(l1);

        System.out.println(!l1.contains(34));  // -> true
        System.out.println(l1.contains(34));  // ->  False

    }
}
