class Solution {
    public int firstUniqChar(String s) {
        int [] hp = new int[26];

        for(int i=0;i<s.length();i++){
            hp[s.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(hp[s.charAt(i)-'a']==1){
                return i;
            }
            
        }
        return -1;

    }
}