class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] f = new int[26];
        int[] ff = new int[26];
        for (int i=0; i<s.length(); i++){
            f[s.charAt(i)-'a']++;
            ff[t.charAt(i)-'a']++;
        }

        for (int i=0; i<26; i++){
            if (f[i] != ff[i]) return false;
        }

        return true;
    }
}
