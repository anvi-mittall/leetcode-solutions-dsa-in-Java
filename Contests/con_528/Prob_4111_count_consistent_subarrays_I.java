package Contests.con_528;

public class Prob_4111_count_consistent_subarrays_I {
    public int countConsistent(int[] nums) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            int and = nums[i];
            int min = nums[i];

            for(int j=i; j<nums.length; j++){
                and = and & nums[j];
                min = Math.min(min, nums[j]);

                if(and == min){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Prob_4111_count_consistent_subarrays_I solution = new Prob_4111_count_consistent_subarrays_I();
        int[] nums = {1, 2, 3, 4};
        int result = solution.countConsistent(nums);
        System.out.println("Number of consistent subarrays: " + result);
    }
}
