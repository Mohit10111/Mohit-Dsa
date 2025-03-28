class Solution {
    public boolean checkZeroOnes(String s) {
        int cout = 0;
        int Count = 0;
        int maxOne = 0;
        int maxZero = 0;
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == '1'){
                cout++;
                maxOne = Math.max(maxOne, cout);
            }
            else{
                cout = 0;
            }
        }
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == '0'){
                Count++;
                maxZero = Math.max(maxZero,Count);
            }
            else{
                Count = 0;
            }
        }
        return maxOne > maxZero;
    }
}