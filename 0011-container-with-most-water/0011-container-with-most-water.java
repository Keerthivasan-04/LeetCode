class Solution {
    public int maxArea(int[] height) {
        int i=0 , j=height.length-1, mx=0;
        while(i<j)
        {
            int w = (j-i)*Math.min(height[i],height[j]);
            mx = Math.max(mx,w);
            if(height[i]<height[j])
                i++;
            else
            j--;
        }
        return mx;
    }
}