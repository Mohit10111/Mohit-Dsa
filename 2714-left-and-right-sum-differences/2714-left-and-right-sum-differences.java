class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        for(int i = 1; i<n; i++){
            prefix[i] = prefix[i-1]+nums[i-1];
        }
        int sufix[] = new int[n];
        for(int i = n-2; i>=0; i--){
            sufix[i] = sufix[i+1] + nums[i+1];
        }

        int answer[] = new int[n];
        for(int i = 0; i<n; i++){
            answer[i] = Math.abs(prefix[i] - sufix[i]);
        }
        return answer;
    }
}