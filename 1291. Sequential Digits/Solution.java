class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int n = (int) Math.log10(low)+1; // number of digits
        List<Integer> res = new ArrayList<>();
        
        int m = 1;
        int prev = 1; // starting digit

        // remaining digit stored in prev
        for (int i = 0; i < n-2; i++) {
            prev = prev*10 + prev%10+1;
            m *= 10; // storing the 10...
        }

        int num = prev;
        while (num <= high) {
            m *= 10; 
            int c = 1; // initial coefficient value
            num = prev*10 + prev%10+1; // adding a digit
            prev = num; // updating previous value

            while (num%10 <= 9 && num%10 != 0 && num <= high && c != 0) {
                if (num >= low && num <= high) res.add(num);
                
                num %= (c*m); // removing the 1st digit 123 -> 23
                num = num*10 + num%10+1; // adding the last digit 23 -> 234
                c = num/m; // updating the coefficient value 1 -> 234/100 -> 2
            }
        }

        return res;
    }
}