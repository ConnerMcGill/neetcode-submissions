class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashmap = new HashMap<>();

        for (String s : strs) {
            char[] sarr = s.toCharArray();
            Arrays.sort(sarr);
            String sortedWord = new String(sarr);
            hashmap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(hashmap.values());
    }
}
