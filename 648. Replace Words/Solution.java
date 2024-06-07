class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Map<Integer, List<String>> map = new TreeMap<>();
        StringBuilder res = new StringBuilder();

        for (String root: dictionary) {
            int len = root.length();
            List<String> list = (map.containsKey(len))? 
                                map.get(len) 
                                : new ArrayList<>();
            list.add(root);
            map.put(len, list); 
        }


        for (String word: sentence.split(" ")) {
            boolean found = false;

            if (res.length() != 0) res.append(" ");

            for (int len: map.keySet()) {
                if (found || len > word.length()) break;

                for (String root: map.get(len)) {

                    if (word.startsWith(root)) {
                        res.append(root);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) res.append(word);;
        }

        return res.toString();
    }
}