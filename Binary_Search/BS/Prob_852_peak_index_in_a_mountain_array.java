package Binary_Search.BS;

public class Prob_852_peak_index_in_a_mountain_array {
    public int peakIndexInMountainArray(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        Prob_852_peak_index_in_a_mountain_array solution = new Prob_852_peak_index_in_a_mountain_array();
        int[] mountainArray = {0, 2, 1, 0};
        int peakIndex = solution.peakIndexInMountainArray(mountainArray);
        System.out.println("Peak index in the mountain array: " + peakIndex);
    }
}
