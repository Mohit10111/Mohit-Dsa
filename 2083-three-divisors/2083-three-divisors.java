class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for(int i =n; i>= 1; i--){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 3){
            return true;
        }    
        return false;    
    }
}