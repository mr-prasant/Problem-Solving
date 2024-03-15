class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int prod = 1;

        for (int num: nums) {
            if (num != 0) prod *= num;
            else zero++;

            if (zero > 1) return new int[nums.length];
        }

        for (int i = 0; i < nums.length; i++) {
            if (zero > 0) {
                nums[i] = (nums[i] == 0)? prod : 0;
            } else {
                nums[i] = prod/nums[i];
            }
        }

        return nums;
    }
}