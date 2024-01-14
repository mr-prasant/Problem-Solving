class Solution {

    public boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        if (n != word2.length()) return false;

        int[] freq1 = new int[26];
        for (int i = 0; i < n; i++) freq1[word1.charAt(i)-97]++;
        
        int[] freq2 = new int[26];
        for (int i = 0; i < n; i++) freq2[word2.charAt(i)-97]++;

        for (int i = 0; i < 26; i++) 
        if ((freq1[i] == 0 && freq2[i] != 0) 
        || (freq1[i] != 0 && freq2[i] == 0)) return false;

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; i++) 
        if (freq1[i] != freq2[i]) return false;
        
        return true;
    }
}