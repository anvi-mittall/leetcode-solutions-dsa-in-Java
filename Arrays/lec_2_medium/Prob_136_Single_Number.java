package Arrays.lec_2_medium;

public class Prob_136_Single_Number {
    public int singleNumber(int[] nums){
        int n = nums.length;

        for(int i=0; i<n; i++){
            int count = 0;

            for(int j=0; j<n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Prob_136_Single_Number s = new Prob_136_Single_Number();
        int[] nums = {1,2,2,4,3,1,4};
        System.out.println(s.singleNumber(nums));
    }
}
