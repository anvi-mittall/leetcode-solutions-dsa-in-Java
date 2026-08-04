package Basic_Maths;

public class Prob_7_Reverse_Integer {
    public int reverse(int x) {
        int rev = 0;
        while(x>0 || x<0){
            int lastdigit = x % 10;

            //overflow check
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE/10 && lastdigit > 7)){
                return 0;
            }

            //underflow check
            if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE/10 && lastdigit < -8)){
                return 0;
            }
            rev = rev * 10 + lastdigit;
            x = x/10;
        }
        return rev;
    }

    public static void main(String args[]){
        Prob_7_Reverse_Integer s = new Prob_7_Reverse_Integer();
        System.out.println(s.reverse(123));
    }
}
