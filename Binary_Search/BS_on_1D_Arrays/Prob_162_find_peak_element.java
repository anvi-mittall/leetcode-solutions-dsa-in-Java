package Binary_Search.BS_on_1D_Arrays;

public class Prob_162_find_peak_element {
    public int findPeakElement(int[] nums){
        int low = 0;
        int high = nums.length - 1;

        if(nums.length == 0) return 0;

        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] < nums[mid + 1]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }

    public static void main(String args[]){
        Prob_162_find_peak_element s = new Prob_162_find_peak_element();
        int[] nums = {1,2,3,1};
        System.out.println(s.findPeakElement(nums));
    }
}
