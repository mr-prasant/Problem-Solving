class Solution {
    public int maxDepth(String s) {
        int brac = 0;
        int max = 0;

        for (char c: s.toCharArray()) {
            if (c == '(') max = Math.max(max, ++brac);
            else if (c == ')') --brac;
        }

        return max;
    }
}