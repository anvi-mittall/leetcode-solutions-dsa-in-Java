package Arrays.lec_1_easy;

public class Prob_905_sort_array_by_parity {
    public int[] sortArrayByParity(int[] nums){
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                result[left++] = nums[i];
            } else {
                result[right--] = nums[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Prob_905_sort_array_by_parity solution = new Prob_905_sort_array_by_parity();
        int[] nums = {3, 1, 2, 4};
        int[] result = solution.sortArrayByParity(nums);
        System.out.println(java.util.Arrays.toString(result));
    }
}
