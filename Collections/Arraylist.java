package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.add(50);
    System.out.println(arr);

    arr.remove(0);
    System.out.println(arr);

    // addAll Method add list1 + list2
    ArrayList<Integer> arr2 = new ArrayList<>();
    arr2.add(101);
    arr2.add(102);
    arr2.add(103);
    arr.addAll(arr2);
    System.out.println(arr);
    // removeAll method remove list1 - list2

    // i want to traversing list using iterator
    Iterator<Integer> iterator = arr.iterator();

    while (iterator.hasNext()) {
      System.out.println("Element " + iterator.next());
    }
    arr.removeAll(arr2);
    System.out.println(arr);

  }

}