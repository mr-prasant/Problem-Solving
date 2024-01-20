class Solution {

    public final int MOD = 1000000007;

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Arrays.fill(left, -1);
        Arrays.fill(right, n);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();

            if (!stack.isEmpty()) left[i] = stack.peek();

            stack.push(i);
        }

        stack.clear();

        for (int i = n-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) stack.pop();

            if (!stack.isEmpty()) right[i] = stack.peek();

            stack.push(i);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += (long) (i-left[i])*(right[i]-i)%MOD * arr[i]%MOD;
            ans %= MOD;
        }

        return (int) ans;
    }
}