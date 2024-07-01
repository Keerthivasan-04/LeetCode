class Solution {
    public int maxSubArray(int[] nums) {
        int cr =0;
        int max = Integer.MIN_VALUE;
        int i =0;
        int n = nums.length;
        while(i<n){
            cr += nums[i];
            if(cr>max){
                max = cr;
            }
            if(cr < 0){
                cr =0;
            }
            i++;
        }
        return max;
    }
}