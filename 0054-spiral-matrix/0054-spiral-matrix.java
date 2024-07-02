class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int lb = 0;
        int hb = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int dir = 0;

        ArrayList<Integer> ans = new ArrayList<Integer>();

        while(lb <=hb && left <= right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                 ans.add(matrix[lb][i]);
                }
                lb++;
            }
           else if(dir==1){
            for(int i=lb;i<=hb;i++){
                    ans.add(matrix[i][right]);
                }
                right--;
           }
           else if(dir==2){
            for(int i=right;i>=left;i--){
                    ans.add(matrix[hb][i]);
                }
                hb--;
           }
           else{
             for(int i=hb;i>=lb;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
           }
           dir++;
           if(dir==4){
            dir = 0;
           }

      }
      return ans;
        
    }
        
}
