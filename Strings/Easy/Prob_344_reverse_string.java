package Strings.Easy;

public class Prob_344_reverse_string {
    public void reverseString(char[] s) {
        int n = s.length;
        int left = 0;
        int right = n - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Prob_344_reverse_string solution = new Prob_344_reverse_string();
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(input);
        System.out.print("Reversed string: ");
        for(char c : input){
            System.out.print(c);
        }
    }
}
