class Solution {
    public int numIslands(char[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        int c = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    c++;
                    mz(grid,i,j,n,m);
                }
            }
        }
        return c;
    }

    void mz(char[][]mat,int i,int j,int n,int m){

        if(i>=n || j>=m ||i<0 || j<0)
            return;
        if(mat[i][j] == '0')
            return;
         
        mat[i][j] = '0';
        mz(mat,i+1,j,n,m);  //up
        mz(mat,i-1,j,n,m);  //down
        mz(mat,i,j+1,n,m);  //right
        mz(mat,i,j-1,n,m);  //left
        
    }
}