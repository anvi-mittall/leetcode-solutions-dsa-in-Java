package Arrays.lec_1_easy;

public class Prob_169_Majority_Element {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Prob_169_Majority_Element s = new Prob_169_Majority_Element();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(s.majorityElement(nums));
    }
}
