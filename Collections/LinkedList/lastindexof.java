package Collections.LinkedList;

import java.util.LinkedList;

public class lastindexof {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println(list.lastIndexOf(20));

    }
    
}
