package String.Practices;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Mohan";
        String r = "";
        int n = str.length();

        for (int i = n-1; i >=0 ; i--) {

            // prepend each character
            char ch = str.charAt(i);
            r = r + ch;
        }
        System.out.println(r);
    }

}
