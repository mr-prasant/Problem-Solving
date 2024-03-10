class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] map = new int[1001];
        int len = 0;

        for (int num: nums1) map[num] = -1;
        for (int num: nums2) {
            if (map[num] == -1) {
                map[num] = 1;
                len++;
            }
        }

        int[] res = new int[len];

        for (int i = 0; i < 1001; i++) 
        if (map[i] == 1) res[--len] = i;

        return res;
    }
}