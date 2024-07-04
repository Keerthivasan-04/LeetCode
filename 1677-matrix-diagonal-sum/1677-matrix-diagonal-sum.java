class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n = mat.length;
        int ms = 0;

        for(int i=0;i<n;i++){
            ms += mat[i][i];
            ms += mat[i][n-i-1];
        }
        if(n%2==1){
            ms -= mat[n/2][n/2];
        }

        return ms;
    }
}