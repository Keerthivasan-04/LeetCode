class Solution {
    public int trap(int[] h) {
        int n = h.length;

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;

        int res = 0;

        while(left <= right){
            if(h[left] <= h[right]){
                if(h[left] >= leftMax){
                    leftMax = h[left];
                }
                else{
                    res += leftMax - h[left];
                }
                left++;
            }
            else{
                if(h[right] >= rightMax){
                    rightMax = h[right];
                }
                else{
                    res += rightMax - h[right];
                }
                right--;
            }
        }
        return res;
    }
}