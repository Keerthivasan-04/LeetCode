class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int min = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                sum -= nums[left];
                left++;
                min = Math.min(min, right - left + 2);
            }
            
        }
        return min == Integer.MAX_VALUE ? 0 : min;
        
    }
}