package Basic_Math;

public class PalindromeNum {
    static int PrintNum(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
        return num;
    }

    static int reverseNum(int num) {
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        return revNum;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverseNumber = reverseNum(num);
        if (originalNum == reverseNumber) {
            System.out.println("It is  a palindrome");
            return true;
        } else {
            System.out.println("It is not a palindrome");
            return false;
        }
    }

    public static void main(String[] args) {

        boolean ans = isPalindrome(1221);
        System.out.println(ans);


    }

}
