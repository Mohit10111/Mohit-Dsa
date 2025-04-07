class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        if(set.size() < 3){
            return Collections.max(set);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : set){
            pq.add(num);
            if(pq.size() > 3){
            pq.remove();
        }
        }
        return pq.peek();
    }
}