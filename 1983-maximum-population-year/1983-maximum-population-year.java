class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] pc = new int[2051];

        for(int[] log : logs){
            int b = log[0];
            int d = log[1];
            pc[b]++;
            pc[d]--;
        }

        int maxp = 0;
        int maxy = 2050;
        int cp = 0;

        for(int yr=1950;yr<=2050;yr++){
            cp += pc[yr];
            while(cp>maxp){
                maxp = cp;
                maxy = yr; 
            }
        }
        return maxy;
    }
}