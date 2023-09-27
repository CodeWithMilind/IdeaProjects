package ArrayList.ArrayDeque;

import java.util.ArrayDeque;

public class Tut93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> d1 = new ArrayDeque();
        {
            d1.add(5);
            d1.add(65);
            d1.add(57);
            d1.add(6);
        }
        System.out.println(d1);
        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());

        d1.addFirst(123);
        d1.addLast(890);

        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());



    }
}
