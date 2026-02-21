class Solution {

    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }



    public void sortColors(int[] nums) {

        int start = 0, mid = 0, end = nums.length - 1;

        while(mid <= end){
            if(nums[mid] == 0){
                swap(nums,start,mid);
                start++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,end);
                end--;
            }
        }

        // int zeroCount = 0;
        // int oneCount = 0;
        // int twoCount = 0;

        // for(int x : nums){
        //     if(x == 0)  zeroCount++;
        //     else if(x == 1) oneCount++;
        //     else    twoCount++;  
        // }
        // int i = 0;
        // while(zeroCount-- > 0){
        //     nums[i] = 0;
        //     i++;
        // }

        
        // while(oneCount-- > 0){
        //     nums[i] = 1;
        //     i++;
        // }

        
        // while(twoCount-- > 0){
        //     nums[i] = 2;
        //     i++;
        // }

        
    }
}