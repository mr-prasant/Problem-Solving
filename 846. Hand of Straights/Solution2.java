class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n%groupSize != 0) return false;

        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Stack<Integer>> inds = new HashMap<>();

        Arrays.sort(hand);
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            Stack<Integer> list = null;
            if (inds.containsKey(hand[i])) {
                list = inds.get(hand[i]);
            } else {
                list = new Stack<Integer>();
            }

            list.add(i);
            inds.put(hand[i], list);
        }

        for (int h: hand) {
            freq.put(h, freq.getOrDefault(h, 0)+1);
        }

        // System.out.println(freq);
        // System.out.println(inds);
        int g = n/groupSize;

        int start = 0;
        while (g-- > 0) {
            while (start < n && visited[start]) start++;
            if (start >= n) return false;

            int s = hand[start];
            for (int i = 0; i < groupSize; i++) {
                if (freq.containsKey(s) && inds.containsKey(s)) {
                    freq.put(s, freq.get(s)-1);
                    visited[inds.get(s).pop()] = true;

                    if (freq.get(s) <= 0) freq.remove(s);
                    if (inds.get(s).isEmpty()) inds.remove(s);

                    s++; 
                } else return false;
            }

        }

        return true;
    }
}