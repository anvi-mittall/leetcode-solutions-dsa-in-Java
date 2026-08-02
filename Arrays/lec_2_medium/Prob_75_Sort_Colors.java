package Arrays.lec_2_medium;

import java.util.Arrays;

public class Prob_75_Sort_Colors {
        public void sortColors(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] >= nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        Prob_75_Sort_Colors s = new Prob_75_Sort_Colors();
        int[] nums = {2,0,2,1,1,0};
        s.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
