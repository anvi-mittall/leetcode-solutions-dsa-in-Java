package Binary_Search.BS_on_Answers;

public class Prob_1482_minimum_no_of_days_to_make_m_bouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k > bloomDay.length){
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int x: bloomDay){
            low = Math.min(low, x);
            high = Math.max(high, x);
        }

        while(low <= high){
            int mid = low + (high - low)/2;

            if(canMake(bloomDay, m, k, mid)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean canMake(int[] bloomDay, int m, int k, int day){
        int bouquets = 0;
        int consecutive = 0;

        for(int nums: bloomDay){
            if(nums <= day){
                consecutive++;

                if(consecutive == k){
                    bouquets++;
                    consecutive = 0;
                }
            }
            else{
                consecutive = 0;
            }
        }
        return bouquets >= m;
    }

    public static void main(String args[]){
        Prob_1482_minimum_no_of_days_to_make_m_bouquets s = new Prob_1482_minimum_no_of_days_to_make_m_bouquets();
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        System.out.println(s.minDays(bloomDay, m, k));
    }
}
