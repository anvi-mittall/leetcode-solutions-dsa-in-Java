package Binary_Search.BS_on_Answers;

public class Prob_1011_capacity_to_ship_packages_within_D_days {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for(int weight: weights){
            low = Math.max(low, weight);
            high += weight;
        }

        while(low <= high){
            int mid = low + (high - low)/2;

            if(canShip(weights, days, mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean canShip(int[] weights, int days, int capacity){
        int currentWeight = 0;
        int requiredDays = 1;

        for(int weight: weights){
            if(currentWeight + weight <= capacity){
                currentWeight += weight;
            }
            else{
                requiredDays++;
                currentWeight = weight;
            }
        }
        return requiredDays <= days;
    }

    public static void main(String[] args) {
        Prob_1011_capacity_to_ship_packages_within_D_days solution = new Prob_1011_capacity_to_ship_packages_within_D_days();
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int result = solution.shipWithinDays(weights, days);
        System.out.println(result);
    }
}
