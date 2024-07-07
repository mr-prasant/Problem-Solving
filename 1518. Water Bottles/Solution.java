class Solution {

    public int helper(int left, int ex) {
        if (left < ex || left <= 0) return 0;

        int emp = left/ex;

        return emp + helper((left%ex)+emp, ex);
    }

    public int numWaterBottles(int numBottles, int numExchange) {
        if (numBottles <= 0) return 0;

        return numBottles + helper(numBottles, numExchange);
    }
}