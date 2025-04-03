class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        if(nums.length == 1){
            return nums[0];
        }
        while(left <= right){
            int mid = (left + right)/2;
            if(mid == 0 && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            if(mid == nums.length-1 && nums[nums.length-1] != nums[nums.length-2]){
                return nums[mid];
            }
            if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }

            if(mid % 2 == 0){
                if(nums[mid-1] == nums[mid]){ //left
                    right = mid-1;
                }
                else{
                    left = mid+1; //right
                }
            }
            else{
                if(nums[mid-1] == nums[mid]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return -1; 
    }
}