class Solution {
    public int numWaterBottles(int numB, int numE) {

        int ans = numB;
        while(numB >= numE)
        {
            ans += numB / numE;
            numB = numB / numE + numB % numE;
        }
        return ans;

    }
}