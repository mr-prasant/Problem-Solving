class Solution {

    public static boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;

        while (low < high) 
        if (s.charAt(low++) != s.charAt(high--)) return false;

        return true;
    }

    public String firstPalindrome(String[] words) {
        for (String w: words) 
        if (isPalindrome(w)) return w;

        return "";
    }
}