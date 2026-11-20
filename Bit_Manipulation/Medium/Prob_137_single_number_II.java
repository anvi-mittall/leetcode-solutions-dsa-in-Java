package Bit_Manipulation.Medium;

public class Prob_137_single_number_II {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for(int i=0; i<32; i++){ // Iterate through each bit position
            int count = 0;

            for(int j=0; j<nums.length; j++){
                if((nums[j] & (1<<i)) != 0){// Check if the ith bit is set in nums[j]
                    count++;
                }
            }

            if(count % 3 != 0){
                ans = ans | (1<<i);// Set the ith bit in the answer if count is not a multiple of 3
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Prob_137_single_number_II solution = new Prob_137_single_number_II();
        int[] nums = {2, 2, 3, 2}; // Example input
        int result = solution.singleNumber(nums);
        
        System.out.println("The single number is: " + result);
    }
}
