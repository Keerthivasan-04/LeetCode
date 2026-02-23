class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = h[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(h[i], leftMax[i - 1]);
        }

        rightMax[n-1] = h[n-1];
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(h[i], rightMax[i + 1]);
        }

        // System.out.println(Arrays.toString(leftMax));
        // System.out.println(Arrays.toString(rightMax));
        int res = 0;
        int tot = 0;

        for(int i = 0; i < n; i++){
            res = 0;
            int bound = Math.min(leftMax[i], rightMax[i]);
            res = bound -  h[i];
            tot += res;
        }
        return tot;
    }
}