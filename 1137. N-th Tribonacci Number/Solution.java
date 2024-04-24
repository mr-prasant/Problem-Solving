class Solution {

    Map<Integer, Integer> memory = new HashMap<>();

    public int helper(int n) {
        if (n <= 1) return 0;
        if (n == 2 || n == 3) return 1;

        if (memory.containsKey(n)) return memory.get(n);

        int res = helper(n-1) + helper(n-2) + helper(n-3);

        memory.put(n, res);
        return res;
    }

    public int tribonacci(int n) {
        return helper(n+1);
    }
}