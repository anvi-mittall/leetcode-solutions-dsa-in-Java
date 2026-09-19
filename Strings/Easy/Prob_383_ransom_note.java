package Strings.Easy;

public class Prob_383_ransom_note {
    public boolean canConstruct(String ransomNote, String magazine){
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0; i<ransomNote.length(); i++){
            freq1[ransomNote.charAt(i) - 'a']++;
        }

        for(int i=0; i<magazine.length(); i++){
            freq2[magazine.charAt(i) - 'a']++;
        }

        for(int i=0; i<26; i++){
            if(freq2[i] < freq1[i]){
               return false;
        }
    }
        return true;
    }

    public static void main(String[] args) {
        Prob_383_ransom_note solution = new Prob_383_ransom_note();
        String ransomNote = "aa";
        String magazine = "aab";
        boolean result = solution.canConstruct(ransomNote, magazine);
        System.out.println("Can the ransom note \"" + ransomNote + "\" be constructed from the magazine \"" + magazine + "\"? " + result);
    }
}
