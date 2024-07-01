class Solution {
    public boolean isPalindrome(int x) {
        String st = String.valueOf(x);
        int l = st.length();
        for(int i =0,j=l-1;i<l/2;i++,j--){
            if(st.charAt(i)!=st.charAt(j)){
                return false;
            }
        }
        return true;       
 }
}