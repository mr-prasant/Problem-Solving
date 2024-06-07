class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        int g = n/groupSize;

        if (n%groupSize != 0) return false;

        Map<Integer, Integer> freq = new TreeMap<>();
        for (int h: hand) freq.put(h, freq.getOrDefault(h, 0)+1);

        Stack<Pair> stack = new Stack<>();

        for (int key: freq.keySet()) {
            stack.push(new Pair(key, freq.get(key)));
        }

        while (g-- > 0) {
            if (stack.size() < groupSize) return false;
            List<Pair> pairs = new ArrayList<>();

            int t = groupSize;
            while (t-- > 0) pairs.add(stack.pop());

            int aux = -1;
            for (Pair pair: pairs) {
                if (pair.val != aux-1 && aux != -1) return false;
                if (pair.freq == 0) return false;
                
                aux = pair.val;
                pair.freq--;
            }

            for (int i = groupSize-1; i >= 0; i--) {
                Pair pair = pairs.get(i);
                if (pair.freq > 0) stack.push(pair);
            }         
        }

        return true;
    }
}

class Pair {
    int val;
    int freq;

    Pair(int val, int freq) {
        this.val = val;
        this.freq = freq;
    }
}