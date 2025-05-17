class Solution {
    public int mostFrequentEven(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i<nums.length; i++){
        if(nums[i]%2 == 0){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
      } 
      int mostFrequent = -1;
      int maxfrequency = Integer.MIN_VALUE;

      for(int key : map.keySet()){
        int frequency = map.get(key);

        if(frequency > maxfrequency ||(frequency == maxfrequency && key < mostFrequent)){
            mostFrequent = key;
            maxfrequency = frequency;
        }
      } 
      return mostFrequent;
    }
}