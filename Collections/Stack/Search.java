package Collections.Stack;

import java.util.Stack;

public class Search {
        public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        System.out.println(list.search(60));
    }
}
