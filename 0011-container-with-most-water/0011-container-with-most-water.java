class Solution {
    public int maxArea(int[] h) {
        int l = 0;
        int r = h.length - 1;
        int max = 0;

        while(l < r){
            int area = Math.min(h[l], h[r]) * (r - l);
            max = Math.max(max,area);

            if(h[l] < h[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return max;
    }
}