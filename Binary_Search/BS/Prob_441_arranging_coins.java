package Binary_Search.BS;

public class Prob_441_arranging_coins {
    public int arrangeCoins(int n){
        int low = 1;
        int high = n;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;
            long coins = (long) mid * (mid + 1) / 2;

            if(coins<=n){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Prob_441_arranging_coins solution = new Prob_441_arranging_coins();
        int n = 5;
        int completeRows = solution.arrangeCoins(n);
        System.out.println("Number of complete rows that can be formed with " + n + " coins: " + completeRows);
    }
}
