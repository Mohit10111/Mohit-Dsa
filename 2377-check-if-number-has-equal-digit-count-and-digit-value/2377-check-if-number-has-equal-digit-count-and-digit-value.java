class Solution {
    public boolean digitCount(String num) {
        int freq[] = new int[10];
        for(int i = 0; i<num.length(); i++){
            int idx = num.charAt(i)-'0';
            freq[idx]++;
        }
        for(int i = 0; i< num.length(); i++){
            int count = num.charAt(i)-'0';
            if(freq[i] != count){
                return false;
            }
        }
        return true;
    }
}