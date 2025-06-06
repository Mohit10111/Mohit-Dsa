class Solution{
    public boolean isUgly(int n){
        if(n <= 0){
            return false;
        }
        while(n%2 == 0){
            n/=2;
        }
        while(n%3 == 0){
            n/=3;
        }
        while(n%5 == 0){
            n/=5;
        }
        return n==1;
    }
}
// not for all the cases
// class Solution {
//     public boolean isUgly(int n) {
//         if(n==1){
//             return true;
//         }
//         if(n<=0){
//             return false;
//         }
//        for(int i = 2; i<n; i++){
//         if(n%i  == 0 && i!=2 && i!=3 && i!=5){
//             return false;
//         }
//        } 
//        return true;
//     }
// }