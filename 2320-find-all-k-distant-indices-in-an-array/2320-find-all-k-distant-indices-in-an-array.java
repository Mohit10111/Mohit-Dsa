class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == key && Math.abs(i - j) <= k) {
                    set.add(i);
                    break;      
                }
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
