class Solution {
    public int maxPower(String s) {
        int max = 1;
        int count = 1;
        for(int i = 1; i< s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                count = 1;
            }

            max = Math.max(count, max);
        }
        return max;
    }
}