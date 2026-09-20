package Basic_Maths;

public class Prob_50_pow_x_n {
    public double myPow(double x, int n) {
        double y = Math.pow(x,n);
        return y;
    }

    public static void main(String[] args) {
        Prob_50_pow_x_n solution = new Prob_50_pow_x_n();
        double x = 2.0;
        int n = 10;
        double result = solution.myPow(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
