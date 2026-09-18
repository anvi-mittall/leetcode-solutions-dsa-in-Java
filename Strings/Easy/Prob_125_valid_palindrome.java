package Strings.Easy;

public class Prob_125_valid_palindrome {
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Prob_125_valid_palindrome solution = new Prob_125_valid_palindrome();
        String s = "A man, a plan, a canal: Panama";
        // Preprocess the string to remove non-alphanumeric characters and convert to lowercase
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        s = cleaned.toString();
        boolean result = solution.isPalindrome(s);
        System.out.println("Is \"" + s + "\" a palindrome? " + result);
    }
}
