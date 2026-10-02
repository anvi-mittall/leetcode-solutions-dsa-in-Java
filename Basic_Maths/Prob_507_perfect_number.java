package Basic_Maths;

public class Prob_507_perfect_number {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num%i == 0){
                sum += i;
            }
        }

        if(sum == num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Prob_507_perfect_number solution = new Prob_507_perfect_number();
        int num = 28;
        boolean result = solution.checkPerfectNumber(num);
        System.out.println("Is " + num + " a perfect number? " + result);
    }
}
