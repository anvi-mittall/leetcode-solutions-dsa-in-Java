package Arrays.lec_1_easy;

import java.util.Arrays;

public class Prob_189_Rotate_Array_method1 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        while(k > 0){
            int last = nums[n-1];
            for(int i=n-1; i>0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = last;
            k--;
        }
    }

    public static void main(String args[]){
        Prob_189_Rotate_Array_method1 s = new Prob_189_Rotate_Array_method1();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        s.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

}
