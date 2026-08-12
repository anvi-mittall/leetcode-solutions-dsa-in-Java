package Arrays.lec_2_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob_18_Four_Sum {
    public List<List<Integer>> fourSum(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n-3; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            for(int j=i+1; j<n-2; j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                int l = j+1;
                int k = n-1;
                while(l<k){
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[k];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        while(l<k && nums[l] == nums[l+1]){
                            l++;
                        }

                        while(l<k && nums[k] == nums[k-1]){
                            k--;
                        }

                        l++;
                        k--;
                    }else if(sum < target){
                        l++;
                    }else{
                        k--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_18_Four_Sum s = new Prob_18_Four_Sum();
        int[] nums = {1,-2,3,5,7,9};
        int target = 7;
        List<List<Integer>> result = s.fourSum(nums, target);
        System.out.println(result);
    }
}
