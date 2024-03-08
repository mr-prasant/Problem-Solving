class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num: nums) freq.put(num, freq.getOrDefault(num, 0)+1);

        int res = 0;

        for (int v: freq.values()) res = Math.max(res, v);

        int maxval = res;
        res = 0;
        
        for (int val: freq.values()) 
        if (maxval == val) res += val;

        return res;
    }
}