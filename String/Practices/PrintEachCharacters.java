package String.Practices;

public class PrintEachCharacters {
    public static void main(String[] args) {
        String str = "Babber";

        for (int i = 0; i < str.length(); i++) {
             char result = str.charAt(i);
             System.out.println(i+" index value is: "+result);
        }
    }
    
}
