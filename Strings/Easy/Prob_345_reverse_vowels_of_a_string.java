package Strings.Easy;

public class Prob_345_reverse_vowels_of_a_string{
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(!"aeiouAEIOU".contains(String.valueOf(arr[left]))){
                left++;
            }
            else if(!"aeiouAEIOU".contains(String.valueOf(arr[right]))){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        Prob_345_reverse_vowels_of_a_string solution = new Prob_345_reverse_vowels_of_a_string();
        String s = "hello";
        String result = solution.reverseVowels(s);
        System.out.println("Reversed vowels string: " + result);
    }
}