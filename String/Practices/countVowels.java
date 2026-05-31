package String.Practices;

public class countVowels {
    public static void main(String[] args) {
        int count = 0;
        String str = "BAbbar";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                count++;
            }

        }
        System.out.println(count);
    }

}
