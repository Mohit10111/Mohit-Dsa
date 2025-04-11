class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        if(n == k){
            int digit = n%k;
            sum += digit;
            n/=k;
        }
        while(n > 0){
            sum += n%k;
            n/=k;
        }

        return sum;
    }
}