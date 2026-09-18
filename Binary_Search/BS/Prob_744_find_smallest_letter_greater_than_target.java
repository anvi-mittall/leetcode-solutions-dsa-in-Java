package Binary_Search.BS;

public class Prob_744_find_smallest_letter_greater_than_target {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        char result = letters[0]; // Initialize result with the first letter

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (letters[mid] > target) {
                result = letters[mid]; // Update result to the current letter
                high = mid - 1; // Search in the left half
            } else {
                low = mid + 1; // Search in the right half
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Prob_744_find_smallest_letter_greater_than_target solution = new Prob_744_find_smallest_letter_greater_than_target();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char nextLetter = solution.nextGreatestLetter(letters, target);
        System.out.println("The smallest letter greater than '" + target + "' is: " + nextLetter);
    }
}
