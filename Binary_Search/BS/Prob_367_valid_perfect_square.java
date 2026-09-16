package Binary_Search.BS;

public class Prob_367_valid_perfect_square {
    public boolean isPerfectSquare(int num){
        int low = 0;
        int high = num;

        while(low <= high){
            int mid = low + (high - low)/2;
            long sq = (long)mid * mid;

            if(sq == num){
                return true;
            }
            if(sq < num){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Prob_367_valid_perfect_square solution = new Prob_367_valid_perfect_square();
        int num = 16;
        boolean result = solution.isPerfectSquare(num);
        System.out.println(num + " is a perfect square: " + result);
    }
}
