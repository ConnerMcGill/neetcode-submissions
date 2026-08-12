class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character, Integer> smap = new HashMap<>();
       HashMap<Character, Integer> tmap = new HashMap<>();

       if (s.length() != t.length()) {
        return false;
       }

       for (int i = 0; i < s.length(); i++) {
        char sc = s.charAt(i);
        char tc = t.charAt(i);
        smap.put(sc, smap.getOrDefault(sc, 0) + 1);
        tmap.put(tc, tmap.getOrDefault(tc, 0) + 1);
       }

       return smap.equals(tmap);
    }
}
