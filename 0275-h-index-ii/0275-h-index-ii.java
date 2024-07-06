class Solution {
    public int hIndex(int[] c) {
        int low = 0;
        int high = c.length-1;
        int h = 0;
        while(low<=high)
        {
            int mid = (low + high)/ 2;
            if(c.length - mid <=c[mid])
            {
                h = c.length - mid;
                high = mid -1;

            }
            else
            {
                low = mid + 1;
            }
        }
        return h;
    }
}