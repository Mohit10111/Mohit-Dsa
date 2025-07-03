class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }
    public int helper(int nums[], int idx , int dp[]){
        if(idx >= nums.length){
            return 0;
        }
        if(dp[idx] != -1) return dp[idx];
        int inc = nums[idx]+helper(nums, idx+2, dp);
        int exc = helper(nums, idx+1, dp);
        int max = Math.max(inc, exc);
        dp[idx] = max;
        return max;
    }
}