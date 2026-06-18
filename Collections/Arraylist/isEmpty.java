package Collections.Arraylist;

import java.util.ArrayList;

public class isEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Is the list empty? " + list.isEmpty());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
