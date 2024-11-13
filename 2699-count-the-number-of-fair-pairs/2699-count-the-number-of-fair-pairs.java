class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return help(nums, upper + 1) - help(nums, lower);
    }

    public long help(int[] nums, int value){
        int left = 0;
        int right = nums.length - 1;
        long res = 0;

        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum < value){
                res += (right - left);
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}