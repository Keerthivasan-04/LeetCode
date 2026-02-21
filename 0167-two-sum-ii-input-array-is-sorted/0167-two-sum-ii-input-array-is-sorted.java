class Solution {
    public int[] twoSum(int[] n, int target) {
        int l = 0;
        int r = n.length - 1;

        while(l < r){
            int sum = n[l] + n[r];
            if(sum == target){
                return new int[]{l+1, r+1};
            }
            else if(sum < target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[]{-1,-1};





        // for(int i = 0; i < n.length; i++){
        //     for(int j = i + 1; j < n.length; j++){
        //         if(n[i] + n[j] == target){
        //             return new int[]{i+1, j+1};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};
        
    }
}