class Solution {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int cr = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        while(i < n){
            cr += nums[i];
            max = (cr > max) ? cr : max;
            cr = (cr < 0) ? 0 : cr;
            i++;
        }
        return max;
        
    }
}