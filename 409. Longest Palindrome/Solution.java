class Solution {

    public int longestPalindrome(String s) {
        boolean[] chars = new boolean[58];
        int count = 0;

        for (char ch: s.toCharArray()) {
            int c = ch-65;
            if (chars[c]) {
                count += 2;
                chars[c] = false;
            } else chars[c] = true;
        }

        return count < s.length()? count+1 : count;
    }
}