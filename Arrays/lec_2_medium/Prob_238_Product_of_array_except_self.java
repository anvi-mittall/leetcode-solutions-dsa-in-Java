package Arrays.lec_2_medium;

public class Prob_238_Product_of_array_except_self {
    public int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];

        int prefix = 1;
        for(int i=0; i<n; i++){
            ans[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_238_Product_of_array_except_self s = new Prob_238_Product_of_array_except_self();
        int[] nums = {1,2,3,4};
        int[] result = s.productExceptSelf(nums);
        System.out.println(result);
    }
}
