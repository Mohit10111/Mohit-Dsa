class Solution {
    public int minimumChairs(String s) {
        int count = 0;
        int max = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == 'E'){
                count++;
            }
            if(s.charAt(i) == 'L'){
                count--;
            }

            max =  Math.max(count, max);
        }
        return max;
    }
}