class Solution {
    public int[] twoSum(int[] n, int target) {
        // int[] res = new int[2];

        for(int i = 0; i < n.length; i++){
            for(int j = i + 1; j < n.length; j++){
                if(n[i] + n[j] == target){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[]{-1,-1};


        // int left = 0;
        // int right = n.length - 1;

        // while(left < right){
        //     int sum = n[left] + n[right];
        //     if(sum < target){
        //         left++;
        //     }
        //     else if(sum > target){
        //         right--;
        //     }
        //     else{
        //         break;
        //     }
        // }
        
        // return new int[]{left + 1, right + 1};
        
    }
}