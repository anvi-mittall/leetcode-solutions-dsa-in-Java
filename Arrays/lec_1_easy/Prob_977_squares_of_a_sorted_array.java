package Arrays.lec_1_easy;

import java.util.Arrays;

public class Prob_977_squares_of_a_sorted_array {
    public int[] sortedSquares(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Prob_977_squares_of_a_sorted_array solution = new Prob_977_squares_of_a_sorted_array();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
}
