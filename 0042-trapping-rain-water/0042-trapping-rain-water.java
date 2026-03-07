class Solution {
    public int trap(int[] h) {
        int n = h.length;
        
        int[] leftMax = new int[n];
        leftMax[0] = h[0];
        for(int i = 1; i <= n-1; i++){
            leftMax[i] = Math.max(h[i],leftMax[i-1]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1] = h[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(h[i],rightMax[i+1]);
        }
        int bound = 0;

        for(int i = 0; i < n; i++){
            bound += Math.min(leftMax[i],rightMax[i]) - h[i];
        }
        return bound;
    }
}