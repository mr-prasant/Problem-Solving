class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> wins = new ArrayList<>();
        List<Integer> loses = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        int[] map = new int[100001];

        for (int[] match: matches) {
            int win = match[0];
            int loss = match[1];

            if (map[win] == 0) map[win] = -1;

            if (map[loss] == -1) map[loss] = 1;
            else map[loss]++;
        }

        for (int i = 0; i < 100001; i++) {
            if (map[i] == 1) loses.add(i);
            if (map[i] == -1) wins.add(i);
        }

        res.add(wins);
        res.add(loses);

        return res;
    }
}