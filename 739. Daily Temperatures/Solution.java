class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int n = temps.length;
        int[] res = new int[n];
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        for (int i = n-1; i >= 0; i--) {
            if (pQueue.isEmpty()) {
                pQueue.offer(i);
                res[i] = 0;
            } else {
                while (!pQueue.isEmpty() && temps[i] >= temps[pQueue.peek()])
                pQueue.poll();

                res[i] = (pQueue.isEmpty())? 0 : pQueue.peek()-i;
            }

            pQueue.offer(i);
        }
        
        return res;
    }
}