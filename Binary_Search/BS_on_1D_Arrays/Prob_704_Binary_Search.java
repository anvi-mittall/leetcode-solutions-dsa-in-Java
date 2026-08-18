package Binary_Search.BS_on_1D_Arrays;

public class Prob_704_Binary_Search {
    public int search(int[] nums, int target){
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
        return -1;
    }

    public static void main(String args[]){
        Prob_704_Binary_Search s = new Prob_704_Binary_Search();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(s.search(nums, target));
    }
}
