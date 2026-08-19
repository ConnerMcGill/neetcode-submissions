class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] sword = s.toCharArray();
            Arrays.sort(sword);
            String sortedKey = new String(sword);
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
