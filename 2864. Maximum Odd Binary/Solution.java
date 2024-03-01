class Solution {
    public String maximumOddBinaryNumber(String s) {
        int once = 0, zero = 0;
        for (char c: s.toCharArray()) 
        if (c == '0') zero++;
        else once++;

        String res = "";
        once--;
        while (once-- > 0) res += "1";
        while (zero-- > 0) res += "0";

        return (res += "1");
    }
}