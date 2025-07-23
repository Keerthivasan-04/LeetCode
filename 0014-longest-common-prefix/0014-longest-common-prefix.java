class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String p = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String cs = strs[i];
            int j = 0;

            while (j < p.length() && j < cs.length() && p.charAt(j) == cs.charAt(j)) {
                j++;
            }
            
            
            p = p.substring(0, j);
            
            
            if (p.equals("")) {
                break;
            }
        }
        
        return p;
    }
}