package Arrays.lec_2_medium;

public class Prob_2149_Rearrange_Elements_By_Sign {
    public int[] rearrangeArray(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0;
        int neg = 0;

        for(int i=0; i<n; i++){
            if(nums[i] > 0){
                ans[2 * pos] = nums[i];
                pos++;
            }else{
                ans[2 * neg + 1] = nums[i];
                neg++;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_2149_Rearrange_Elements_By_Sign s = new Prob_2149_Rearrange_Elements_By_Sign();
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(s.rearrangeArray(nums));
    }
}
