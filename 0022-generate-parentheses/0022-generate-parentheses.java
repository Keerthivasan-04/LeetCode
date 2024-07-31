class Solution {
    List <String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        generateValue(0,0,n,"");
        return ans;
    }

    public void generateValue (int open,int close,int n,String str){

        if(str.length() == 2 * n){
            ans.add(str);
            return;
        }

        if(open < n){
            generateValue(open + 1,close,n,str+"(");
        }

        if(close < open){
            generateValue(open,close+1,n,str+")");
        }
    }
}