class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1; 
        long right = num/2;
        if(num == 1 || num == 0){
            return true;
        }
        while(left <=  right){
            long mid = (left+right)/2;

            if(mid*mid == num){
                return true;
            }
            if(mid*mid > num){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
}