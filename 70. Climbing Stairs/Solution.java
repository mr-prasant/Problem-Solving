class Solution {
    public int climbStairs(int n) {
        int p = 1;
        int q = 1;
        
        while (n-- > 1) {
            int t = p;
            p += q;
            q = t;
        }

        return p;
    }
}