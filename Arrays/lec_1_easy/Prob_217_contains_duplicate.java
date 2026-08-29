package Arrays.lec_1_easy;

import java.util.Arrays;

public class Prob_217_contains_duplicate {
    public boolean containsDuplicate(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Prob_217_contains_duplicate solution = new Prob_217_contains_duplicate();
        int[] nums = {1, 2, 3, 1};
        boolean result = solution.containsDuplicate(nums);
        System.out.println(result);
    }
}
