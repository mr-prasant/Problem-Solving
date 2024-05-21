class Solution {

    public void helper(int[] nums, int i, List<Integer> path, List<List<Integer>> res) {
        if (i == nums.length) {
            res.add(path);
            return;
        }

        List<Integer> selected = new ArrayList<>(path);
        selected.add(nums[i]);
        helper(nums, i+1, path, res);
        helper(nums, i+1, selected, res);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, new ArrayList<Integer>(), res);

        return res;
    }
}