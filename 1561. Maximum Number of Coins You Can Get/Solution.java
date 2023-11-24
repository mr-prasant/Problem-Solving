class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int t = piles.length/3;
        int p = piles.length;

        int res = 0;
        while (t-- > 0) res += piles[(p -= 2)];
        
        return res;
    }
}