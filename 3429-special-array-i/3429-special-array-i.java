class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1)    return true;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] % 2 == nums[i + 1] % 2){
                return false;
            }
            
        }
        return true;
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] % 2 == 0){
        //         if(count < 1){
        //             count++;
        //         }
        //     }
        //     else{
        //         if(count < 1){
        //             count++;
        //         }
        //     }

        // }
    }
}