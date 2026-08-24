package Binary_Search.BS_on_Answers;

public class Prob_875_koko_eating_bananas {
    public int minEatingSpeed(int[] piles, int h){
        int low = 1;
        int high = 0;
        for(int i=0; i<piles.length; i++){
            high = Math.max(high, piles[i]);
        }

        int ans = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            
            long totalHours = 0;
            for(int i=0; i<piles.length; i++){
                totalHours += Math.ceil((double)piles[i]/mid);
            }

            if(totalHours <= h){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Prob_875_koko_eating_bananas s = new Prob_875_koko_eating_bananas();
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(s.minEatingSpeed(piles, h));
    }
}
