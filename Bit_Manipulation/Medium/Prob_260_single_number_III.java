package Bit_Manipulation.Medium;

public class Prob_260_single_number_III {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        // Step 1: XOR of all elements
        for(int i=0; i<nums.length; i++){
            xor = xor ^ nums[i];
        }

        // Step 2: Find rightmost set bit
        int bit = xor & (-xor);

        int a = 0;
        int b = 0;

        // Step 3: Divide into two groups
        for(int i=0; i<nums.length; i++){
            if((nums[i] & bit) == 0){
                a = a ^ nums[i];
            }else{
                b = b ^ nums[i];
            }
        }
        // Step 4: Return both unique numbers
        return new int[]{a,b};
    }

    public static void main(String[] args) {
        Prob_260_single_number_III solution = new Prob_260_single_number_III();
        int[] nums = {1, 2, 1, 3, 2, 5}; // Example input
        int[] result = solution.singleNumber(nums);
        
        System.out.println("The two single numbers are: " + result[0] + " and " + result[1]);
    }
}
