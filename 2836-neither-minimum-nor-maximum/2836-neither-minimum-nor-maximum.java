class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int bichka = 0;
        if(nums.length<=2){
            return -1;
        }
        for(int i = 0; i<nums.length; i++){
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > min && nums[i] < max){
                bichka =  nums[i];
            }
        }
        return bichka;
    }
}