class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int ch = 0;
        int co = 0;
        while(ch < g.length && co < s.length){
            if(g[ch] <= s[co])
            ch++;
            co++;
        }
        return ch;
    }
}