class Solution {
    public int threeSumClosest(int[] nums, int target) {

        
        Arrays.sort(nums);
        int c = nums[0] + nums[1] + nums[2]; //c=-4
        
        for(int i=0;i<nums.length-2;i++){

            int j = i + 1;
            int k = nums.length - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k]; // -4-1+2 = -3  sum = -3  
                if(Math.abs(target - sum) < Math.abs(target - c)){ // (1-(-3)) < (1-(-4)) 4<5
                    c = sum;
                }
                if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return c;
    }
}