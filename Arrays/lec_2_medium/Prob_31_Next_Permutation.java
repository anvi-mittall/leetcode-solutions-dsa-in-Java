package Arrays.lec_2_medium;

import java.util.Arrays;

public class Prob_31_Next_Permutation {
    public void nextPermutation(int[] nums){
        int n = nums.length;
        int index = -1;

        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(nums,0,n-1);
            return;
        }
        
        for(int i=n-1; i>index; i--){
            if(nums[i] > nums[index]){
                swap(nums,i,index);
                break;
            }
        }

        reverse(nums,index+1,n-1);
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String args[]){
        Prob_31_Next_Permutation s = new Prob_31_Next_Permutation();
        int[] nums = {1,2,3};
        s.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
