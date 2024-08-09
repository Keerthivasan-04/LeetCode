class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (rows < 3 || cols < 3) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isValidMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    private boolean isValidMagicSquare(int[][] grid, int startRow, int startCol) {
        boolean[] numPresence = new boolean[10];
        int targetSum = 0;
        
       
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                int num = grid[startRow + i][startCol + j];
                if (num < 1 || num > 9 || numPresence[num]) {
                    return false;
                }
                numPresence[num] = true;
                rowSum += num;
                colSum += grid[startRow + j][startCol + i];
            }
            if (i == 0) {
                targetSum = rowSum;
            } else if (rowSum != targetSum || colSum != targetSum) {
                return false;
            }
        }
        
        int mainDiagonalSum = grid[startRow][startCol] + grid[startRow + 1][startCol + 1] + grid[startRow + 2][startCol + 2];
        int antiDiagonalSum = grid[startRow][startCol + 2] + grid[startRow + 1][startCol + 1] + grid[startRow + 2][startCol];
        
        return mainDiagonalSum == targetSum && antiDiagonalSum == targetSum;
    }
}




// class Solution {
//     public int numMagicSquaresInside(int[][] grid) {
//         int ans = 0;
//         if(grid.length < 2 || grid[0].length < 2)    return 0;

//         for(int i = 0; i < grid.length - 2; i++){
//             for(int j = 0; j < grid[i].length - 2; j++){
//                 if(isGrid(i,j,grid)) ans++;
//             }
//         }
//         return ans;
//     }

//     public boolean isGrid(int x , int y, int[][] grid){
//         boolean[] visited = new boolean [10];
//         for(int i = 0; i < 3; i++){
//             for(int j = 0; j < 3;j++){
//                 int num = grid[x+i][y+j];
//                 if(num < 1 || num > 9) return false;
//                 if(visited[num])    return false;
//                 visited[num] = true;
//             }
//         }

//         int row1 = grid[x][y] + grid[x][y+1] + grid[x][y+2];
//         int row2 = grid[x+1][y] + grid[x+1][y+1] + grid[x+1][y+2];
//         int row3 = grid[x+2][y] + grid[x+2][y+1] + grid[x+2][y+2];

//         if(row1 != row2 || row2 != row3) return false;

//         int col1 = grid[x][y] + grid[x+1][y] + grid[x+2][y];
//         int col2 = grid[x][y+1] + grid[x+1][y+1] + grid[x+2][y+1];
//         int col3 = grid[x][y+2] + grid[x+1][y+2] + grid[x+2][y+2];

//         if(col1 != col2 || col2 != col3)    return false;

//         int diagonal1 = grid[x][y] + grid[x+1][y+1] + grid[x+2][y+2];
//         int diagonal2 = grid[x][y+2] + grid[x+1][y+1] + grid[x+2][y+2];

//         if(diagonal1 != diagonal2) return false;
//         return true;
//     }
// }