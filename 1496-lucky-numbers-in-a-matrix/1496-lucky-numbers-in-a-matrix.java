class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int[] r = new int[n];
        int[] c = new int[m];

        Arrays.fill(r,Integer.MAX_VALUE);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                r[i] = Math.min(r[i],matrix[i][j]);
                c[j] = Math.max(c[j],matrix[i][j]);
            }

        }

        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i] == c[j]){
                    l.add(r[i]);
                }
            }
        }
        return l;
    }  
}


// class Solution {
//     public List<Integer> luckyNumbers (int[][] matrix) {

//         List<Integer> l = new ArrayList<>();
//         int minidx = 0;
//         int i =0;
//         int min = matrix[i][0];

//         for(i=0;i<matrix.length;i++){
            
            

//             for(int j=1;j<matrix[i].length;j++){
//                 min = matrix[i][j];
//                 minidx = j;
//             }
//         }
//         boolean c = true;
//         for(int k=0;k<matrix.length;k++){
//             if(matrix[k][minidx]>min){
//                 c = false;
//                 break;
//             }
//         }
//         if(c)
//         l.add(min);
//         return l;
//     }
         
// }
















