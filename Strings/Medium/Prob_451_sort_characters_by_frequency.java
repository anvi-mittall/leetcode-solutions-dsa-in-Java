package Strings.Medium;

public class Prob_451_sort_characters_by_frequency {
    public String frequencySort(String s) {
        int[] freq = new int[256];

        // 1. Frequency count
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }

        String ans = "";

        // 2. Highest frequency wala character baar-baar find karo
        for(int i=0; i<s.length(); i++){
            int max = 0;
            int index = -1;

            for(int j=0; j<256; j++){
                if(freq[j] > max){
                    max = freq[j];
                    index = j;
                }
            }

            if(index == -1) break;
            
            // 3. Character ko uski frequency jitni baar add karo
            for(int j=0; j<max; j++){
                ans += (char) index;
            }

            // 4. Is character ki frequency 0 kar do
            freq[index] = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        Prob_451_sort_characters_by_frequency solution = new Prob_451_sort_characters_by_frequency();
        String s = "tree";
        String result = solution.frequencySort(s);
        System.out.println("Sorted characters by frequency: " + result);
    }
}
