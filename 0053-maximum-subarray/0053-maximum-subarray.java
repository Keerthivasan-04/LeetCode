class Solution {
    public int maxSubArray(int[] nums) {
        int cr =0;
        int max = Integer.MIN_VALUE;
        int i =0;
        int n = nums.length;
        while(i<n){
            cr += nums[i];
            max = (cr>max)?cr : max;
                
            cr = (cr < 0) ? 0:cr;
    
            i++;
        }
        // System.gc();
        return max;
    }
}