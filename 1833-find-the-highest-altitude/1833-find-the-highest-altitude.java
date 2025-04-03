class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int n = gain.length;
        int pre[] = new int[n+1];
        for(int i = 1; i<=n; i++){
            pre[i] = pre[i-1]+gain[i-1];
        }
        for(int i = 0; i<= n; i++){
            if(pre[i] > max){
                max = pre[i];
            }
        }
        return max;
    }
}