class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashmap = new HashMap<>();

        for (String s : strs) {
            char[] word = new char[26];
            for (int i = 0; i < s.length(); i++) {
                word[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(word);
            hashmap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(hashmap.values());
    }
}
