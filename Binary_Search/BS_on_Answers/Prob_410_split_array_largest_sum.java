package Binary_Search.BS_on_Answers;

public class Prob_410_split_array_largest_sum {
    public int splitArray(int[] nums, int k){
        if(k > nums.length){
            return -1;
        }

        int low = 0;
        int high = 0;
        for(int num: nums){
            low = Math.max(low, num);
            high += num;
        }

        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;

            int count = 1;
            int sum = 0;
            for(int num: nums){
                sum += num;
                if(sum + num<= mid){
                    sum += num;
                }else{
                    count++;
                    sum = num;
                }
            }

            if(count <= k){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_410_split_array_largest_sum s = new Prob_410_split_array_largest_sum();
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(s.splitArray(nums, k));
    }
}