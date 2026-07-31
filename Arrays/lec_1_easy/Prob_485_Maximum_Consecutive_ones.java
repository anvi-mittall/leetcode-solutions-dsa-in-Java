package Arrays.lec_1_easy;

public class Prob_485_Maximum_Consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int max_count = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                count++;
                max_count = Math.max(max_count, count);
            }
            else{
                count = 0;
            }
        }
        return max_count;
    }

    public static void main(String args[]){
        Prob_485_Maximum_Consecutive_ones s = new Prob_485_Maximum_Consecutive_ones();
        int[] nums = {1,1,0,1,1,1};
        System.out.println(s.findMaxConsecutiveOnes(nums));
    }
}
