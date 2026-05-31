package String.Practices;

public class Palindrome {
    public static void main(String[] args) {
        String str = "mom";
        String reverse = "";
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;

        }
        if (str == reverse) {
            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }

}
