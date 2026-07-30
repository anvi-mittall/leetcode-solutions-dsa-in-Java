package Arrays.lec_1_easy;

import java.util.Arrays;

public class Prob_283_Move_Zeroes_To_End {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String args[]){
        Prob_283_Move_Zeroes_To_End s = new Prob_283_Move_Zeroes_To_End();
        int[] nums = {0,1,0,3,12};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
