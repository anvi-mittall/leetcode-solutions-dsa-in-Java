package Strings.Easy;

public class Prob_14_longest_common_prefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for(int i=1; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
                
                if(prefix.length() == 0){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Prob_14_longest_common_prefix solution = new Prob_14_longest_common_prefix();
        String[] strs = {"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result);
    }
}
