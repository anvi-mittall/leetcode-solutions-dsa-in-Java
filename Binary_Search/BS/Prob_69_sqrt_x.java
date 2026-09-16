package Binary_Search.BS;

public class Prob_69_sqrt_x {
    public int mySqrt(int x){
        int low = 0;
        int high = x;
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;
            long sq = (long)mid * mid;

            if(sq == x){
                return mid;
            }
            if(sq < x){
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Prob_69_sqrt_x solution = new Prob_69_sqrt_x();
        int x = 8;
        int result = solution.mySqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result);
    }
}
