class Solution {
    public int singleNumber(int[] nums) {
        int c =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-10)
            {
                c=0;
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]==nums[j]&&i!=j)
                    { 
                        nums[j]=-10;
                        c++;
                    }
                }
            }
            if(c==0){
               return nums[i];
            }
        }
        return 0;

    }
}