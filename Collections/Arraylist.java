package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
    arr.removeAll(arr2);
    System.out.println(arr);

    // i want to traversing list using iterator
    Iterator<Integer> iterator = arr.iterator();

    while (iterator.hasNext()) {
      System.out.println("Element " + iterator.next());
    }

    // create list3
    List<Integer> list3 = new ArrayList<>();
    list3.add(11);
    list3.add(12);
    list3.add(14);
    list3.add(15);

    System.out.println("Before set: " + list3);
    System.out.println(list3.get(1));

    list3.set(2, 13);
    System.out.println("After set: " + list3);
    System.out.println(list3);

    // koi bhi collection(like stack queue vector list) ko Array me convert kar na
    // hai to toArray method ko use kar he hai

    Object[] arr4 = list3.toArray();
    for (Object obj : arr4) {
      System.out.println(obj);
    }

    //Contains Method element present hai ya nhi
    System.out.println(list3.contains(12));
  }

}