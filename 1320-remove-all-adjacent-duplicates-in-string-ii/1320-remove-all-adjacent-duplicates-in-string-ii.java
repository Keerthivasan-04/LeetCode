class Solution {
    public String removeDuplicates(String s, int k) {

        Stack <int[]> stk = new Stack<>();
        
        for(char i : s.toCharArray())
        {
            if(!stk.isEmpty() && stk.peek()[0] == i)
            {
                stk.peek()[1]++;
            }
            else{
                stk.push(new int[]{i,1});
            }
            if(stk.peek()[1]==k){
                stk.pop();
            }
        }
        
    
        StringBuilder res = new StringBuilder();
        while(!stk.isEmpty())
        {
            int top[] = stk.pop();
            while(top[1] -- >0)
                res.append((char)top[0]);
        }
        return res.reverse().toString();
    }
}