class Solution {
    public int[][] generateMatrix(int n) {

        int[][] ans = new int[n][n];

        int lb = 0;
        int hb = n-1;
        int left = 0;
        int right = n-1;
        int dir = 0;
        int val = 1;

        while(lb <= hb && left <= right){

            // move left to right
            for(int i = left; i <= right; i++){
                ans[lb][i] = val++;
            }        
            lb++;

            //move down
            for(int i = lb; i <= hb; i++){
                ans[i][right] = val++;
            }     
            right--;

            //move right to left
            //move bottom to top
            if(left<=right && lb<=hb){
                
                //move right to left
                for(int i = right; i >= left; i--){
                    ans[hb][i] = val++;
                }     
                hb--;

                //move bottom to top
                for(int i = hb; i >= lb; i--){
                    ans[i][left] = val++;  
                }
                left++;
            }
        }
        return ans;
    }
}