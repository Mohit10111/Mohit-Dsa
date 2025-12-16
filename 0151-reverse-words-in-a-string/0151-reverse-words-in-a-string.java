class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); //trimp remove the extra space but do not remove sapce between words Ex:- "  hello world  "-> "hello world" and split splits the words (\\s+) s means where extraspace find split them s+ means 1 on more extar space
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
