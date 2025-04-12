class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : candyType){
            set.add(n);
        }
        int max = candyType.length/2;
        return Math.min(set.size(), max);
    }
}