class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int a: arr) freq.put(a, freq.getOrDefault(a, 0)+1);

        ArrayList<Integer> vals = new ArrayList<>(freq.values());
        Collections.sort(vals);

        int res = 0;
        int idx = 0, count = 0;
        while (idx < vals.size()) {
            count += vals.get(idx);

            if (count == k) break;
            else if (count < k) idx++;
            else {
                idx--;
                break;
            }
        }

        return vals.size()-idx-1;
    }
}