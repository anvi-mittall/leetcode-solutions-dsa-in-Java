package Arrays.lec_1_easy;

public class Prob_1539_kth_missing_positive_number {
    public int findKthPositive(int[] arr, int k){
        int num = 1;
        int i = 0;
        int missing = 0;

        while(missing < k){
            if(i < arr.length && arr[i] == num){
                i++;
            }else{
                missing++;
            }

            if(missing == k){
                return num;
            }
            num++;
        }
        return -1;
    }

    public static void main(String args[]){
        Prob_1539_kth_missing_positive_number s = new Prob_1539_kth_missing_positive_number();
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(s.findKthPositive(arr, k));
    }
}
