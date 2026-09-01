package Arrays.lec_2_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob_442_find_all_duplicates_in_an_array {
    public List<Integer> findDuplicates(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int count = 0;

        for(int i=0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                count++;
                if(count == 1){
                    ans.add(nums[i]);
                }
            } else {
                count = 0;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_442_find_all_duplicates_in_an_array s = new Prob_442_find_all_duplicates_in_an_array();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(s.findDuplicates(nums));
    }
}
