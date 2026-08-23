package Arrays.lec_1_easy;

import java.util.Arrays;

public class Prob_1929_concatenation_of_array {
    public int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_1929_concatenation_of_array s = new Prob_1929_concatenation_of_array();
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(s.getConcatenation(nums)));
    }
}
