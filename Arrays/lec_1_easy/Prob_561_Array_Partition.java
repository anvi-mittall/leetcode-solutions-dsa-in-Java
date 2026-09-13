package Arrays.lec_1_easy;

import java.util.Arrays;

public class Prob_561_Array_Partition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Prob_561_Array_Partition solution = new Prob_561_Array_Partition();
        int[] nums = {1, 4, 3, 2};
        int result = solution.arrayPairSum(nums);
        System.out.println(result); // Output: 4
    }
}
