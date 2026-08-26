package Binary_Search.BS_on_Answers;

public class Prob_1283_find_the_smallest_divisor_given_a_threshold {
    public int smallestDivisor(int[] nums, int threshold){
        int n = nums.length;
        int maxVal = nums[0];

        for(int i=1; i<n; i++){
            if(nums[i] > maxVal){
                maxVal = nums[i];
            }
        }

        int low = 1;
        int high = maxVal;

        while(low < high){
            int mid = low + (high - low)/ 2;

            int sum = 0;
            for(int num : nums){
                sum += (num + mid - 1) / mid; // This is equivalent to Math.ceil(num / mid)
            }

            if(sum <= threshold){
                high = mid;
            }else{
                low = mid = 1;
            }
        }
        return low;
    }

    public static void main(String args[]){
        Prob_1283_find_the_smallest_divisor_given_a_threshold s = new Prob_1283_find_the_smallest_divisor_given_a_threshold();
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(s.smallestDivisor(nums, threshold));
    }
}
