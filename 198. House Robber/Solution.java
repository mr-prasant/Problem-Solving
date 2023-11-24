class Solution {
    private HashMap<String, Integer> map = new HashMap<>();

    private int helper(int[] nums, int ci, int n) {
        if (map.containsKey(nums[ci]+"*"+ci)) return map.get(nums[ci]+"*"+ci);

        int sum = nums[ci];
        int max = 0;
        
        for (int k = ci+2; k < n; k++)
        max = Math.max(max, helper(nums, k, n));

        sum += max;
        map.put(nums[ci]+"*"+ci,sum);

        return sum;
    }

    public int rob(int[] nums) {
        int res = 0;
        for (int i = nums.length-1; i >= 0; i--) 
        res = Math.max(res, helper(nums, i, nums.length));

        return res;
    }
}