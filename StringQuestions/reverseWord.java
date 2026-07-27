package StringQuestions;

public class reverseWord {
    public static void main(String[] args) {
        String s = "the sky is blue";
        int i = s.length() - 1;
        StringBuilder ans = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }
            int j = i;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            if (ans.length() > 0) {
                ans.append(" ");
            }
            ans.append(s.substring(j + 1, i + 1));
            i = j;
        }
        String m = ans.toString();
        System.out.println(m);
    }
}
