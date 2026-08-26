package Arrays.lec_1_easy;

import java.util.ArrayList;
import java.util.List;

public class Prob_2824_count_pairs_whose_sum_is_less_than_target {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count = 0;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums.get(i) + nums.get(j) < target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        Prob_2824_count_pairs_whose_sum_is_less_than_target s = new Prob_2824_count_pairs_whose_sum_is_less_than_target();
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int target = 8;
        System.out.println(s.countPairs(nums, target));
    }
}
