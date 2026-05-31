package String;

public class splitmethod {
    public static void main(String[] args) {
        String str = "My,name,is,Ram";
        String[] word = str.split(",");

        for (String str1 : word) {
            System.out.println(str1);
        }
    }

}
