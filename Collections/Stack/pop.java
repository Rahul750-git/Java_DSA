package Collections.Stack;

import java.util.Stack;

public class pop {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        System.out.println("Pop the element before: " + list);
        list.pop();
        System.out.println("Pop the element After: " + list);

    }
}
