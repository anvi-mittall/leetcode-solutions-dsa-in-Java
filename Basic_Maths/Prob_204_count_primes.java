package Basic_Maths;

public class Prob_204_count_primes {
    public int countPrimes(int n) {
        if(n <= 2){
            return 0;
        }

        boolean[] isPrime = new boolean[n];

        for(int i=2; i<n; i++){
            isPrime[i] = true;
        }

        for(int i=2; i*i < n; i++){
            if(isPrime[i]){
                for(int j=i*i; j<n; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i=2; i<n; i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Prob_204_count_primes solution = new Prob_204_count_primes();
        int n = 10;
        int result = solution.countPrimes(n);
        System.out.println("Number of primes less than " + n + ": " + result);
    }
}
