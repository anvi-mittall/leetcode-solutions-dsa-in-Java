package Arrays.lec_1_easy;

import java.util.ArrayList;
import java.util.List;

public class Prob_303_Range_sum_query_immutable {
    List<Integer> prefixSum;
    public Prob_303_Range_sum_query_immutable(int[] nums) {
        prefixSum = new ArrayList<>();
        prefixSum.add(0);
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            prefixSum.add(sum);
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum.get(right + 1) - prefixSum.get(left);
    }

    public static void main(String args[]){
        int[] nums = {-2, 0, 3, -5, 2, -1};
        Prob_303_Range_sum_query_immutable s = new Prob_303_Range_sum_query_immutable(nums);
        System.out.println(s.sumRange(0, 2));
        System.out.println(s.sumRange(2, 5));
        System.out.println(s.sumRange(0, 5));
    }
}
