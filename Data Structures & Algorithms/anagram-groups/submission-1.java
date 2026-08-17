class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] splitWord = s.toCharArray();
            Arrays.sort(splitWord);
            String sortedWord = new String(splitWord);
            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
