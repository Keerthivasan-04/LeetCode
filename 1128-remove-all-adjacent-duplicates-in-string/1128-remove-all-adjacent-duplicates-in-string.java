class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> stk = new Stack<>();
        
        for(char i : s.toCharArray())
        {
            if(!stk.isEmpty())
            {
                if(stk.peek()==i)
                {
                    stk.pop();
                }
                else
                {
                    stk.push(i);
                }

            }
            else{
                stk.push(i);
            }
        }
        
    
        StringBuilder res = new StringBuilder();
        for(char c : stk){
            res.append(c);
        }
        return res.toString();
    }
}