class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int res[] = new int[nums.length];
        //Time limit exceed 
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < nums.length; j++) {
        //         if (j % 2 == 0 && nums[j] % 2 != 0) {
        //             for (int k = 1; k < nums.length; k += 2) {
        //                 if (nums[k] % 2 == 0) {
        //                     int temp = nums[j];
        //                     nums[j] = nums[k];
        //                     nums[k] = temp;
        //                     break;
        //                 }
        //             }
        //         }
        //     }
        //     res[i] = nums[i]; 
        // }
        // return res;
        int even = 0;
        int odd = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 ==0){
                res[even] = nums[i];
                even += 2;
            }
            else{
                res[odd] = nums[i];
                odd += 2;
            }
        }
        return res;
    }
}
