package Arrays.lec_1_easy;

public class Prob_922_sort_array_by_parity_II {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int odd = 1;
        int even = 0;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            if(nums[i] % 2 == 0){
                arr[even] = nums[i];
                even += 2;
            }else{
                arr[odd] = nums[i];
                odd += 2;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Prob_922_sort_array_by_parity_II solution = new Prob_922_sort_array_by_parity_II();
        int[] nums = {4, 2, 5, 7};
        int[] result = solution.sortArrayByParityII(nums);
        System.out.print("Sorted array by parity: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
