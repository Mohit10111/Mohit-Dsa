class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];

        int startrow = 0;
        int startcol = 0;
        int endrow = n - 1;
        int endcol = n - 1;

        int num = 1;

        while (startrow <= endrow && startcol <= endcol) {

            // top row
            for (int i = startcol; i <= endcol; i++) {
                arr[startrow][i] = num++;
            }

            // right column
            for (int i = startrow + 1; i <= endrow; i++) {
                arr[i][endcol] = num++;
            }

            // bottom row
            if (startrow < endrow) {
                for (int i = endcol - 1; i >= startcol; i--) {
                    arr[endrow][i] = num++;
                }
            }

            // left column
            if (startcol < endcol) {
                for (int i = endrow - 1; i > startrow; i--) {
                    arr[i][startcol] = num++;
                }
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }

        return arr;
    }
}
