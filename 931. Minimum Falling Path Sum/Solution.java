class Solution {

    private final int MAX = Integer.MAX_VALUE;
    private HashMap<String, Integer> memory;

    public int helper(int[][] mat, int n, int p, int q) {
        if (p >= n) return 0;
        if (q < 0 || q >= n) return MAX;
        if (p == n-1) return mat[p][q];

        String key = p+"*"+q;
        if (memory.containsKey(key)) return memory.get(key);

        int min = MAX;
        if (q-1 >= 0) min = Math.min(min, helper(mat, n, p+1, q-1));
        if (q+1 >= 0) min = Math.min(min, helper(mat, n, p+1, q+1));
        min = Math.min(min, helper(mat, n, p+1, q));

        min += mat[p][q];
        memory.put(key, min);

        return min;
    }

    public int minFallingPathSum(int[][] matrix) {
        int min = MAX;
        int n = matrix.length;
        memory = new HashMap<>();

        for (int i = 0; i < n; i++)
        min = Math.min(min, helper(matrix, n, 0, i));

        return min;
    }
}