class Solution {
    public void sortColors(int[] nums) {
        int n0 = 0, n1=0,n2 =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) n0++;
            if(nums[i]==1) n1++;
            if(nums[i]==2) n2++;

        }
        int i =0;
        while(n0!=0){
            nums[i++] = 0;
            n0--;
        }
        while(n1!=0){
            nums[i++] = 1;
            n1--;
        }
        while(n2!=0){
            nums[i++] = 2;
            n2--;
        }        
    }
}