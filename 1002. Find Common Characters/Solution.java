class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        int[] freq = new int[26];
        List<String> res = new ArrayList<>();

        for (char w: words[0].toCharArray()) freq[w-'a']++;
        
        for (int i = 1; i < n; i++) {
            int[] cf = new int[26];

            for (int c: words[i].toCharArray()) 
            cf[c-'a']++;

            for (int j = 0; j < 26; j++) {
                if (freq[j] == 0) continue;

                freq[j] = Math.min(freq[j], cf[j]);
            }
        }

        for (int i = 0; i < 26; i++) {
            while (freq[i]-- > 0) {
                res.add(((char)(i+97)) + "");
            } 
        }
        

        return res;
    }
}