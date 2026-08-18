package Binary_Search.BS_on_1D_Arrays;

public class Prob_35_Search_Insert_Position {
    public int searchInsert(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String args[]){
        Prob_35_Search_Insert_Position s = new Prob_35_Search_Insert_Position();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(s.searchInsert(nums, target));
    }
}
