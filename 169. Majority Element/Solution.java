class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int maxf = 0;
        int maxn = Integer.MIN_VALUE;

        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0)+1);

            if (map.get(n) > maxf) {
                maxn = n;
                maxf = map.get(n);
            }
        }

        return maxn;
    }
}