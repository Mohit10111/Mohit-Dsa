class Solution {
    public int alternateDigitSum(int n) {
        int count = 0;
        int curr = n;
        while(curr>0){
            int d = curr%10;
            count++;
            curr/=10;
        }
        int i = 1;
        int sum = 0;
        if(count %2 == 0){
            while(n>0){
                int digit = n%10;
                if(i%2 != 0){
                    sum -=digit; 
                }
                else{
                    sum += digit;
                }
                n/=10;
                i++;
            }
        }
        else{
            while(n > 0){
                int digit = n%10;
                if(i%2 != 0){
                    sum += digit;
                }
                else{
                    sum -= digit;
                }
                n/=10;
                i++;
            }
        }
        return sum;
    }
}