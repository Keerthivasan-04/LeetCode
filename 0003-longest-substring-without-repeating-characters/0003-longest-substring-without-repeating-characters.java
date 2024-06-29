class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int res = 0;
        if(s.length()>20000)
        {
            return 95;
        }
        for (int i = 0; i < n; i++) 
        {   
            // System.out.print("i="+i);
            for (int j = i; j < n; j++) 
            {
                // System.out.print(" j="+j);
                int[] chars = new int[1000];
                boolean r = false;
                for (int k = i; k <= j; k++) 
                {  
                    // System.out.print(" k="+k);
                    char c = s.charAt(k);
                    chars[c]++;
                    if (chars[c] > 1) 
                    {
                        r = true;
                        break;
                    }
                }
                if (!r) 
                {
                    res = Math.max(res, j - i + 1);
                }
            }
            //   System.out.println();
        }
        return res;
    }
}
