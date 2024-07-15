class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [] target = new int[nums.length];
        for(int i=1;i<nums.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(index[j]>=index[i]){
                    index[j]++;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            target[index[i]] = nums[i];
        }


        return target;
    }
}