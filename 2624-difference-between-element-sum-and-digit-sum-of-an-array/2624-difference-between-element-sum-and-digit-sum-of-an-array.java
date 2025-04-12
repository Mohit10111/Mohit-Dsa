class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            elementSum+=nums[i];
        } 
        int digitSum = 0;
        for(int i= 0; i<n; i++){
            int curr = nums[i];
            while(curr >0){
                int d = curr%10;
                digitSum+=d;
                curr/=10;
            }
        }  
        return Math.abs(digitSum - elementSum);
    }
}