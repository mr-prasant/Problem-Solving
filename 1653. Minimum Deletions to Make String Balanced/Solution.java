class Solution {
    public int minimumDeletions(String s) {
        int count = 0;
        int bcount = 0;

        for (char c: s.toCharArray()) {
            if (c == 'a') {
                if (bcount > 0) {
                    bcount--;
                    count++;
                }
            } else bcount++;
            
        }

        return count;
    }
}