package Arrays.lec_1_easy;

public class Prob_2395_find_subarrays_with_equal_sum {
    public boolean findSubarrays(int[] nums){
        int n = nums.length;

        for(int i=0; i<n-1; i++){
            int sum1 = nums[i] + nums[i+1];
            for(int j=i+1; j<n-1; j++){
                int sum2 = nums[j] + nums[j+1];
                if(sum1 == sum2){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        Prob_2395_find_subarrays_with_equal_sum s = new Prob_2395_find_subarrays_with_equal_sum();
        int[] nums = {4,2,4};
        System.out.println(s.findSubarrays(nums));
    }
}
