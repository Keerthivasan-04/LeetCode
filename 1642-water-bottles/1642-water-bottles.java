class Solution {
    public int numWaterBottles(int numB, int numE) {



        return numB + (numB - 1) / (numE - 1);

        // int ans = numB;
        // while(numB >= numE)
        // {
        //     ans += numB / numE;
        //     numB = numB / numE + numB % numE;
        // }
        // return ans;

    }
}