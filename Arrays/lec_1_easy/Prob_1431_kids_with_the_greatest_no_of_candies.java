package Arrays.lec_1_easy;

import java.util.ArrayList;
import java.util.List;

public class Prob_1431_kids_with_the_greatest_no_of_candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;

        int max = candies[0];
        for(int i=0; i<n; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String args[]){
        Prob_1431_kids_with_the_greatest_no_of_candies s = new Prob_1431_kids_with_the_greatest_no_of_candies();
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(s.kidsWithCandies(candies, extraCandies));
    }
}
