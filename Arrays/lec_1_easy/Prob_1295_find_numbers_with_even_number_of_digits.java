package Arrays.lec_1_easy;

public class Prob_1295_find_numbers_with_even_number_of_digits {
    public int findNumbers(int[] nums){
        int n = nums.length;
        int ans = 0;

        for(int i=0; i<n; i++){
            int count = 0;
            int x = nums[i];

            while(x > 0){
                count++;
                x = x/10;
            }

            if(count % 2 == 0){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_1295_find_numbers_with_even_number_of_digits s = new Prob_1295_find_numbers_with_even_number_of_digits();
        int[] nums = {12,345,2,6,7896};
        System.out.println(s.findNumbers(nums));
    }
}
