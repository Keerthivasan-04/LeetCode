class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int t=nums.length;
        int i=0;
        while(t>i){
            cs += nums[i];

            if(cs>ms){
                ms=cs;
            }
            if(nums[i]<=0){
                cs=0;
            }
            i++;
        }
        System.gc();
        return ms;
    }
}