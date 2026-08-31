package Arrays.lec_2_medium;

import java.util.Arrays;

public class Prob_287_find_the_duplicate_number {
    public int findDuplicate(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Prob_287_find_the_duplicate_number s = new Prob_287_find_the_duplicate_number();
        int[] nums = {1,3,4,2,2};
        System.out.println(s.findDuplicate(nums));
    }
}
