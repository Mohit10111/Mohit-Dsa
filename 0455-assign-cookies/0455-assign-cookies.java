class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int G = 0;
        int S = 0;
        int n = g.length;
        int m = s.length;

        int count = 0;

        while(G<n && S<m){
            if(s[S] >= g[G]){
                count++;
                G++;
            }
            S++;
        }
        return count;
    }
}