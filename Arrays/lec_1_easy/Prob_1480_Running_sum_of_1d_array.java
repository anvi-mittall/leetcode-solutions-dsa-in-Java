package Arrays.lec_1_easy;

import java.util.Arrays;

public class Prob_1480_Running_sum_of_1d_array {
    public int[] runningSum(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for(int i=1; i<n; i++){
            ans[i] = ans[i-1] + nums[i];
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_1480_Running_sum_of_1d_array s = new Prob_1480_Running_sum_of_1d_array();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(s.runningSum(nums)));
    }
}
