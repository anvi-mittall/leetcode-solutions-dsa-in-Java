package Binary_Search.BS_on_1D_Arrays;

public class Prob_540_Single_element_in_sorted_array {
    public int singleNonDuplicate(int[] nums){
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low)/2;
            if(mid % 2 == 1) mid--; // make mid even
            if(nums[mid] == nums[mid + 1]){
                low = mid + 2;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }

    public static void main(String args[]){
        Prob_540_Single_element_in_sorted_array s = new Prob_540_Single_element_in_sorted_array();
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(s.singleNonDuplicate(nums));
    }
}
