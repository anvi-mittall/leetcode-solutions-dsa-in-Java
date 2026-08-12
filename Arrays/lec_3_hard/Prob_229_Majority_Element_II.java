package Arrays.lec_3_hard;

import java.util.ArrayList;
import java.util.List;

public class Prob_229_Majority_Element_II {
    public List<Integer> majorityElementTwo(int[] nums){
        List<Integer> ans  = new ArrayList<>();

        int n = nums.length;
        for(int i=0; i<n; i++){
            if(ans.contains(nums[i])){
                continue;
            }

            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > n/3){
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_229_Majority_Element_II s = new Prob_229_Majority_Element_II();
        int[] nums = {1,2,1,1,3,2};
        List<Integer> result = s.majorityElementTwo(nums);
        System.out.println(result);
    }
}
