class Solution {
    public int[] twoSum(int[] nums, int target) {

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j] + nums[j-i] == target){
        //             return new int[]{j,j-i};
        //         }
        //     }
        // }
        // return null;

        int [] n = new int [2];
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    n[0]=i;
                    n[1]=j;
                    break;
                }
                
            }
        }
     return n;
        
    }
}