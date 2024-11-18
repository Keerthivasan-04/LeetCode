class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int [] ans = new int[n];

        if(k == 0){
            for(int i = 0; i < n; i++){
                ans[i] = 0;
            }
        }
        else if(k > 0){
            for(int i = 0; i < n; i++){
                int count = 0;
                int sum = 0;
                while(count != k){
                    sum += code[(i+1+count) % n];
                    count++;
                }
                ans[i] = sum;
            }
        }
        else{
            for(int i = 0; i < n; i++){
                int count = 0;
                int sum = 0;
                while(count != Math.abs(k)){
                    sum += code[(i-1-count+n) % n];
                    count++;
                }
                ans[i] = sum;
            }
        }
        return ans;
    }
}