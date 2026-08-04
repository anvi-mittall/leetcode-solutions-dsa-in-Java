package Basic_Maths;

public class Prob_9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;

        while(x > 0){
            int lastdigit = x % 10;
            rev = rev * 10 + lastdigit;
            x = x/10;
        }
        if(original == rev){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]){
        Prob_9_Palindrome_Number s = new Prob_9_Palindrome_Number();
        System.out.println(s.isPalindrome(121));
    }
}
