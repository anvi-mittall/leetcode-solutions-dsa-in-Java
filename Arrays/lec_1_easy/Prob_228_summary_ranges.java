package Arrays.lec_1_easy;

import java.util.ArrayList;
import java.util.List;

public class Prob_228_summary_ranges {
    public List<String> summaryRanges(int[] nums){
        List<String> ans = new ArrayList<>();
        int i = 0;

        while(i < nums.length){
            int start = nums[i];
            while(i + 1 < nums.length && nums[i + 1] == nums[i] + 1){
                i++;
            }
            int end = nums[i];

            if(start == end){
                ans.add(String.valueOf(start));
            } else {
                ans.add(start + "->" + end);
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Prob_228_summary_ranges solution = new Prob_228_summary_ranges();
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> result = solution.summaryRanges(nums);
        System.out.println(result);
    }
}
