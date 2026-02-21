class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for(int x : nums){
            if(x == 0)  zeroCount++;
            else if(x == 1) oneCount++;
            else    twoCount++;  
        }
        int i = 0;
        while(zeroCount-- > 0){
            nums[i] = 0;
            i++;
        }

        
        while(oneCount-- > 0){
            nums[i] = 1;
            i++;
        }

        
        while(twoCount-- > 0){
            nums[i] = 2;
            i++;
        }

        
    }
}