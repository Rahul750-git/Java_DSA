package Searching_Algorithms.Binary_Search;

public class RotiPrata {
    static boolean isValidAns(int totalParatha, int cooks[], int totalCook, int timeLimit) {
        int parathaCount = 0;
        for (int i = 0; i < cooks.length; i++) {
            int currentCookRank = cooks[i];
            int timeTaken = 0;
            int j = 1;
            while (timeTaken <= timeLimit) {
                if (timeTaken + j * currentCookRank <= timeLimit) {
                    timeTaken = timeTaken + j * currentCookRank;
                    parathaCount++;
                    j++;
                } else {
                    break;
                }
            }
            if (parathaCount >= totalParatha) {
                return true;
            }
        }
        if (parathaCount >= totalParatha) {
            return true;
        } else {
            return false;
        }
    }

    static int minTimeToCookPratas(int p,int cooks[],int n){
        int maxRank = -1;
        for (int i = 0; i < cooks.length; i++) {
            if (cooks[i]>maxRank) {
                maxRank = cooks[i];
            }
        }
        int s = 0;
        int ans = -1;
        int e = maxRank * (p*(p+1)/2);
        while (s<=e) {
            int mid = s + (e-s)/2;
            if (isValidAns(p, cooks, n, mid)) {
                ans = mid;
                e = mid -1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int cooks[] = {1,2,3,4};
        int p = 10;
        int n = 4;
        int ans = minTimeToCookPratas(p, cooks, n);
        System.out.println(ans);
    }
}
