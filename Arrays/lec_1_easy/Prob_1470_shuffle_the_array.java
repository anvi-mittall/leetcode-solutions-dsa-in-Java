package Arrays.lec_1_easy;

import java.util.Arrays;

public class Prob_1470_shuffle_the_array {
    public int[] shuffle(int[] nums, int n){
        int[] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[2*i] = nums[i];
            ans[2*i + 1] = nums[i+n];
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_1470_shuffle_the_array s = new Prob_1470_shuffle_the_array();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(s.shuffle(nums, n)));
    }
}
