class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i - 1], words[i])) {
                list.add(words[i]);
            }
        }
        return list;
    }

    public static boolean isAnagram(String s, String t) {
        int freq[] = new int[26];
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
