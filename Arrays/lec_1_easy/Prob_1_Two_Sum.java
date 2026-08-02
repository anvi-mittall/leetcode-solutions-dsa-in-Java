package Arrays.lec_1_easy;

public class Prob_1_Two_Sum {
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return nums;
    }

    public static void main(String args[]){
        Prob_1_Two_Sum s = new Prob_1_Two_Sum();
        int[] nums = {1,6,2,10,3};
        int target = 7;
        System.out.println(s.twoSum(nums, target));
    }
}