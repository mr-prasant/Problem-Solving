class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] map = new int[1001];

        for (int t: target) map[t]++;

        for (int a: arr) {
            if (map[a] == 0) return false;
            else map[a]--;
        }

        return true;
    }
}