// class Solution {
//     public int[][] restoreMatrix(int[] rowSum, int[] colSum) {

//         int n = rowSum.length;
//         int m = colSum.length;

//         int[][] ans = new int[n][m];

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 int x = Math.min(rowSum[i],colSum[j]);
//                 ans[i][j] = x;
//                 rowSum[i] -= x;
//                 colSum[j] -= x;
//             }
//         }
//         return ans;
        
//     }
// }



// Optimised Solution 1 ms 
class Solution {
    public int[][] restoreMatrix(int[] r, int[] c) {

        int n = r.length;
        int m = c.length;

        int[][] ans = new int[n][m];

        int i = n - 1;
        int j = m - 1;

        while(i >= 0 && j >= 0){

            if(r[i] <= c[j]){
                ans[i][j] = r[i];
                c[j] -= r[i];
                i--;
            }

            else{
                ans[i][j] = c[j];
                r[i] -= c[j];
                j--; 
            }
        }
        return ans;
    }
}
