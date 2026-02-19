class Solution {
    public int[] twoSum(int[] n, int target) {
        int left = 0;
        int right = n.length - 1;

        while(left < right){
            int sum = n[left] + n[right];
            if(sum < target){
                left++;
            }
            else if(sum > target){
                right--;
            }
            else{
                break;
            }
        }
        
        return new int[]{left + 1, right + 1};
        
    }
}