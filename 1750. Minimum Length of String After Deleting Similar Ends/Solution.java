class Solution {
    public int minimumLength(String s) {
        int low = 0, high = s.length()-1;

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) return (high-low+1);

            while (low < high && s.charAt(low) == s.charAt(low+1)) low++;
            while (high > low && s.charAt(high) == s.charAt(high-1)) high--;
            low++;
            high--;
        }

        return (low == high)? 1 : 0;
    }
}