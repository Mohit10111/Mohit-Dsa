class Solution {
    public int minOperations(int[] nums, int k) {
    HashSet<Integer> set = new HashSet<>();
    int n = nums.length;
    int count = -1;

    
    for (int num : nums) {
        set.add(num);
    }
    if(set.size() == 1 && set.contains(k)){
        return 0;
    }

    
    for (int num : set) {
        if (num < k) {
            return -1;
        }
    }

   
    for (int num : set) {
        if (num > k) {
            count++;
        }
    }
    if(count < 0){
        return -1;
    }

    return count+1;
    }
}