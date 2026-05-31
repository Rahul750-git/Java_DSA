package String;

public class replaceChar {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Before "+str);
        str = str.replace("World!", "Guys");
        System.out.println("After "+str);
    }

}
