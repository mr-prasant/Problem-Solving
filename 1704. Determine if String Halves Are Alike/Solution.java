class Solution {

    public void addVowels(Set<Character> VOWELS, String v) {
        for (int i = 0; i < v.length(); i++) VOWELS.add(v.charAt(i));
    }

    public boolean halvesAreAlike(String s) {
        Set<Character> VOWELS = new HashSet<>();
        addVowels(VOWELS, "aeiouAEIOU");

        int sum = 0, i = 0;

        while (i < s.length()/2)
        if (VOWELS.contains(s.charAt(i++))) sum++;

        while (i < s.length())
        if (VOWELS.contains(s.charAt(i++))) sum--;

        return (sum == 0);
    }
}