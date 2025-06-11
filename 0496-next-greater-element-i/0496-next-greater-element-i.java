class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int ans[] = new int[nums1.length];
        for(int i = 0; i<n; i++){
            int X = nums1[i];
            int j = 0;
            while(j< nums2.length && nums2[j] != X){
                j++;
            }
            int k = j+1;
            while(k < nums2.length && nums2[k] <= X){
                k++;
            }
            if(k < nums2.length){
                ans[i] = nums2[k];
            }
            else{
                ans[i] = -1;
            }
        }
        return ans;
    }
}