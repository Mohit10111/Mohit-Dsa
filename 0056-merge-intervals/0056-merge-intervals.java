class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int current[] = intervals[0];
        List<int[]> list = new ArrayList<>();
        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0] <= current[1]){
                current[1] = Math.max(current[1], intervals[i][1]);
            }
            else{
                list.add(current);
                current = intervals[i];
            }
        }
        list.add(current);
        return list.toArray(new int[list.size()][]);
    }
}