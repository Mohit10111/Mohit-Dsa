class Solution {
    public int findGCD(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<nums.length; i++){
            largest = Math.max(largest, nums[i]);
            smallest = Math.min(smallest, nums[i]);
        }
        for(int i = smallest; i>=1; i--){
            if(smallest % i == 0 && largest % i == 0){
                return i;
            }
        }
        return 1;
    }
}