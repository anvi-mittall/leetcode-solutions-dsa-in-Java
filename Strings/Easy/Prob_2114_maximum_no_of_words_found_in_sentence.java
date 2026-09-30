package Strings.Easy;

public class Prob_2114_maximum_no_of_words_found_in_sentence {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for(int i=0; i<sentences.length; i++){
            int count = 0;

            for(int j=0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    count++;
                }
            }
            max = Math.max(max, count + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Prob_2114_maximum_no_of_words_found_in_sentence solution = new Prob_2114_maximum_no_of_words_found_in_sentence();
        String[] sentences = {"Hello world", "This is a test", "Java programming is fun"};
        int result = solution.mostWordsFound(sentences);
        System.out.println("The maximum number of words found in a sentence is: " + result);
    }
}
