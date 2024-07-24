class Solution {
    List <String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        generateValue(ans,0,0,n,"");
        return ans;
    }

    public void generateValue (List<String> ans,int open,int close,int n,String str){

        if(str.length() == 2 * n){
            ans.add(str);
            return;
        }

        if(open < n){
            generateValue(ans,open + 1,close,n,str+"(");
        }

        if(close < open){
            generateValue(ans,open,close+1,n,str+")");
        }
    }
}