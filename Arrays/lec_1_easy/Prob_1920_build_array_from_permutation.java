package Arrays.lec_1_easy;

import java.util.Arrays;

public class Prob_1920_build_array_from_permutation {
    public int[] buildArray(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_1920_build_array_from_permutation s = new Prob_1920_build_array_from_permutation();
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(s.buildArray(nums)));
    }
}
