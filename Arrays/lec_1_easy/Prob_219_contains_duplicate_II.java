package Arrays.lec_1_easy;

import java.util.HashMap;

public class Prob_219_contains_duplicate_II{
    public boolean containsNearByDuplicate(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                int prevIndex = map.get(nums[i]);
                if(i - prevIndex <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        Prob_219_contains_duplicate_II solution = new Prob_219_contains_duplicate_II();
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = solution.containsNearByDuplicate(nums, k);
        System.out.println(result);
    }
}