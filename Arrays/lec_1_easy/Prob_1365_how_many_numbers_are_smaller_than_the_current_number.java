package Arrays.lec_1_easy;

public class Prob_1365_how_many_numbers_are_smaller_than_the_current_number {
    public int[] smallerNumbersThanCurrent(int[] nums){
        int n = nums.length;
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String args[]){
        Prob_1365_how_many_numbers_are_smaller_than_the_current_number s = new Prob_1365_how_many_numbers_are_smaller_than_the_current_number();
        int[] nums = {8,1,2,2,3};
        System.out.println(java.util.Arrays.toString(s.smallerNumbersThanCurrent(nums)));
    }
}
