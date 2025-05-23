class Solution {
    public int reverse(int x) {
        int s = 0;
        while(x != 0){
            if((s > Integer.MAX_VALUE / 10)|| (s< Integer.MIN_VALUE /10))
            {
                return 0;
            }
            int d = x % 10;
            s = s * 10 + d;
            x /= 10;
        }
        return s;
    }
}