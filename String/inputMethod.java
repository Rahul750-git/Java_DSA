package String;

import java.util.Scanner;

public class inputMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a string content: ");
        String str = sc.nextLine();
        System.out.println("Value of nextline Method : " + str);

        System.out.println("Provide a string content: ");
        String str2 = sc.next();
        System.out.println("Value of next Method : " + str2);

    }

}
