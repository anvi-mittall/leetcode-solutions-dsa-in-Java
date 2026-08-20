package Binary_Search.BS_on_1D_Arrays;

public class Prob_81_Search_in_rotated_sorted_array_II {
    public boolean search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return true;
            }

            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }

            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }

            else{
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        Prob_81_Search_in_rotated_sorted_array_II s = new Prob_81_Search_in_rotated_sorted_array_II();
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(s.search(nums, target));
    }
}
