package Binary_Search.BS_on_1D_Arrays;

public class Prob_153_Find_minimum_in_rotated_sorted_array {
    public int findMin(int[] nums){
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String args[]){
        Prob_153_Find_minimum_in_rotated_sorted_array s = new Prob_153_Find_minimum_in_rotated_sorted_array();
        int[] nums = {3,4,5,1,2};
        System.out.println(s.findMin(nums));
    }
}
