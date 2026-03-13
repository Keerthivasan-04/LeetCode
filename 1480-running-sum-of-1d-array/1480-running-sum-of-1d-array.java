class Solution {
    public int[] runningSum(int[] nums) {
        int[] leftSum = new int[nums.length];
        leftSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            leftSum[i] = nums[i] + leftSum[i-1];
        }
        return leftSum;
    }
}