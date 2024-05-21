class Solution {

    public int helper(int[] nums, int i, int xor) {
        if (i == nums.length) return xor;

        return helper(nums, i+1, xor) + helper(nums, i+1, xor^nums[i]);

    }

    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
}