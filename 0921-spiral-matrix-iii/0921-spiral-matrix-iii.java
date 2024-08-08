class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] directions = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};

        int[][] ans = new int[rows*cols][2];

        int steps = 0;
        int dir = 0;
        ans[0] = new int[] {rStart,cStart};
        int count = 1;

        while(count < rows * cols){

            if(dir == 0 || dir == 2)    steps++;

            for(int i = 0; i < steps; i++){
                rStart += directions[dir][0];
                cStart += directions[dir][1];

                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                    ans[count++] = new int[] {rStart,cStart};
                }
                if(count == rows*cols)  return ans;
            }
            dir = (dir + 1) % 4;
        }
        return ans;
    }
}