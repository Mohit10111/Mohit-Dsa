class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length; 
        int m = nums2.length;
        int k = 0;
        int i = 0;
        int j = 0;
        int merge[] = new int[n + m];
        double median = 0;

        // Merging both arrays into merge[]
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                merge[k] = nums1[i];
                i++;
            } else {
                merge[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            merge[k++] = nums1[i++];
        }

        while (j < m) {
            merge[k++] = nums2[j++];
        }

        // Correct median logic
        if (merge.length % 2 == 0) {
            int mid = merge.length / 2;
            median = (merge[mid - 1] + merge[mid]) / 2.0;
        } else {
            median = merge[merge.length / 2];
        }

        return median;
    }
}
