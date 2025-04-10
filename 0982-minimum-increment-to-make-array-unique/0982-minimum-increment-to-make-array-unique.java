class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for(int i =1; i<n; i++){
            if(nums[i] <= nums[i-1]){
                int min = (nums[i-1]+1)-nums[i];
                nums[i]+=min;
                count+=min;
            }
        }
        return count;
    }
}