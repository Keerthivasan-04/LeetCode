class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        
        int start = 0;
        int end  =0;
        int max = 0;

        
        for(end = 0;end < s.length(); end++){
            char ch = s.charAt(end);
            freq[ch - 'A']++;
            max = Math.max(max, freq[ch - 'A']);
            // System.out.println(max);
            if((end - start + 1 - max) > k){
                freq[s.charAt(start)-'A']--;
                start++;
            }
        }
        return(end - start);
    }
}