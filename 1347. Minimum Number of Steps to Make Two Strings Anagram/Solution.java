class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++)
        freq[s.charAt(i)-'a']++;

        for (int i = 0; i < t.length(); i++)
        freq[t.charAt(i)-'a']--;

        int res = 0;
        for (int i = 0; i < 26; i++)
        if (freq[i] < 0) res += Math.abs(freq[i]);

        return res;
    }
}