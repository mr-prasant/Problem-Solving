class Solution {

    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;

        while (low < high)
        if (s.charAt(low++) != s.charAt(high--))
        return false;

        return true;
    }

    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) 
        for (int j = i+1; j <= s.length(); j++) 
        count += (isPalindrome(s.substring(i, j)))? 1 : 0;
            
        return count;
    }
}