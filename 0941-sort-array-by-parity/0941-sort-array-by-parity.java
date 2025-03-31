class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[] = new int[nums.length];
        int idx = 0;
        int odd = nums.length-1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                res[idx++] = nums[i];
            }
            else{
                res[odd--] = nums[i];
            }
        }
        return res;
    }
}