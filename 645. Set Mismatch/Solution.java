class Solution {
    public int[] findErrorNums(int[] nums) {
        int rep = 0;
        int mis = 0;

        int[] freq = new int[nums.length+1];
        for (int n: nums) freq[n]++;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) mis = i;
            if (freq[i] > 1) rep = i;
        }

        return new int[] {rep, mis};
    }
}