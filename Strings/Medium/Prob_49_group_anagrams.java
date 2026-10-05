package Strings.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prob_49_group_anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            int[] freq = new int[26];

            for(int i=0; i<s.length(); i++){
                freq[s.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(freq);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Prob_49_group_anagrams solution = new Prob_49_group_anagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        System.out.println("Grouped Anagrams: " + result);
    }
}
