class Solution {

    private Map<Integer, Integer> map; 

    public int helper(int[] nums, int n, int idx) {
        if (idx == n-1) return nums[idx];
        if (idx >= n) return 0;

        if (map.containsKey(idx)) return map.get(idx);
        
        int max = Integer.MIN_VALUE;
        for (int i = idx; i < n; i++)
        max = Math.max(max, helper(nums, n, i+2));

        max += nums[idx];
        map.put(idx, max);
        return max;
    }

    public int rob(int[] nums) {
        map = new HashMap<>(); 

        int max = Integer.MIN_VALUE;
        for (int i = nums.length-1; i >= 0; i--)
        max = Math.max(max, helper(nums, nums.length, i));

        return max;
    }
}