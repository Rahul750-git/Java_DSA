package Recursion;
 
public class CoinsChangeOne {

    static int solve(int coins[],int amount){
        if (amount == 0) {
            return 0;
        }
        if(amount < 0){
            return Integer.MAX_VALUE;
        }    
        int mini = Integer.MAX_VALUE;

        for(int coin:coins){
            int recursionKaAns = solve(coins, amount-coin);
            if (recursionKaAns != Integer.MAX_VALUE) {
                int totalCoinsUsed = recursionKaAns + 1;
                mini = Math.min(totalCoinsUsed, mini);
            }
        }
        return mini;
    }
    public static int CoinsChange(int coins[],int amount){
        int ans = solve(coins, amount);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        else{
            return ans;
        }
    }
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int amount = 11;
        int ans = CoinsChange(coins,amount);
        System.out.println(ans);
    }
}