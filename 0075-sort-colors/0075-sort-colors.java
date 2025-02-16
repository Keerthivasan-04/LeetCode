class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int t =0;
                if(nums[i]>nums[j]){
                    t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
        
    }
}