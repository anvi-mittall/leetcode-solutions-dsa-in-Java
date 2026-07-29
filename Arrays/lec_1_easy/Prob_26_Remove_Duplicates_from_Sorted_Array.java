package Arrays.lec_1_easy;

public class Prob_26_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }

        int i=0;

        for(int j=1; j<n; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String args[]){
        Prob_26_Remove_Duplicates_from_Sorted_Array s = new Prob_26_Remove_Duplicates_from_Sorted_Array();
        int[] nums = {1,1,2};
        System.out.println(s.removeDuplicates(nums));
    }
}
