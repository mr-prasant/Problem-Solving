class Solution {

    int[] dp;

    public int helper(int[] arr, int k, int idx) {
        int n = arr.length;
        if (idx == n) return 0;
        if (dp[idx] > 0) return dp[idx];

        int maxSum = 0, maxNum = 0;
        for (int i = idx; i < Math.min(n, idx+k); i++) {
            maxNum = Math.max(maxNum, arr[i]);
            maxSum = Math.max(maxSum, (i-idx+1)*maxNum + helper(arr, k, i+1));
        }

        return dp[idx] = maxSum;
    }
    
    public int maxSumAfterPartitioning(int[] arr, int k) {
        dp = new int[arr.length];
        return helper(arr, k, 0);
    }
} 