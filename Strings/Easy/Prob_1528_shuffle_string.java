package Strings.Easy;

public class Prob_1528_shuffle_string {
    public String restoreString(String s, int[] indices) {
        char[] shuffled = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            shuffled[indices[i]] = s.charAt(i);
        }

        return new String(shuffled);
    }

    public static void main(String[] args) {
        Prob_1528_shuffle_string solution = new Prob_1528_shuffle_string();
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String result = solution.restoreString(s, indices);
        System.out.println("Restored string: " + result);
    }
}
