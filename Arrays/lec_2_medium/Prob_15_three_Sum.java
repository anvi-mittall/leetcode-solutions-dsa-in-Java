package Arrays.lec_2_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob_15_three_Sum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            int j = i + 1;
            int k = n - 1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_15_three_Sum s = new Prob_15_three_Sum();
        int[] nums = {2,-2,0,3,-3,5};
        List<List<Integer>> result = s.threeSum(nums);
        System.out.println(result);
    }
}
