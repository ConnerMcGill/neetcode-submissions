class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int len = s.length();
        int[] result = new int[26];

        for (int i = 0; i < len; i++) {
            result[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < len; i++) {
            result[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
