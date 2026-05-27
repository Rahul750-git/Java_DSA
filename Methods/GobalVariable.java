package Methods;

public class GobalVariable {
    //global variable
  static  int  a = 10;
    static int b = 20;
    static void printSum(){
        //global Variable
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
       
  
        System.out.println("Value of a: "+a+" Value of b: "+b);
        System.out.println("Hello java");
    }
}
