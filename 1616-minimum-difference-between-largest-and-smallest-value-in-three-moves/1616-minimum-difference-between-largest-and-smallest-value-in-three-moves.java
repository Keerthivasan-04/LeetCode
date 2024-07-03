class Solution {
    public int minDifference(int[] nums) {
        int n=nums.length;
        if(n<=4) 
         return 0;
        Arrays.sort(nums);
        int d1=nums[n-4]-nums[0];
        int d2=nums[n-3]-nums[1];
        int d3=nums[n-2]-nums[2];
        int d4=nums[n-1]-nums[3];

        return Math.min(d1,Math.min(d2,Math.min(d3,d4)));


    }
}