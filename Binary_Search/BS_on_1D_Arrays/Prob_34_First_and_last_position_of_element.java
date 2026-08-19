package Binary_Search.BS_on_1D_Arrays;

public class Prob_34_First_and_last_position_of_element{
    public int[] searchRange(int[] nums, int target){
        int f = firstOccurrence(nums, target);
        int l = lastOccurrence(nums, target);
        return new int[] {f, l};
    }

    public int firstOccurrence(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int first = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                first = mid;
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return first;
    }

    public int lastOccurrence(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int last = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                last = mid;
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return last;
    }

    public static void main(String args[]){
        Prob_34_First_and_last_position_of_element s = new Prob_34_First_and_last_position_of_element();
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(s.searchRange(nums, target));
    }
}