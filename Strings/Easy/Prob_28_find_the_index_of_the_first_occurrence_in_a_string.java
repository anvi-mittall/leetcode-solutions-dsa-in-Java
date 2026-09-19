package Strings.Easy;

public class Prob_28_find_the_index_of_the_first_occurrence_in_a_string {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        Prob_28_find_the_index_of_the_first_occurrence_in_a_string solution = new Prob_28_find_the_index_of_the_first_occurrence_in_a_string();
        String haystack = "hello";
        String needle = "ll";
        int result = solution.strStr(haystack, needle);
        System.out.println("The index of the first occurrence of \"" + needle + "\" in \"" + haystack + "\" is: " + result);
    }
}
