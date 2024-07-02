class Solution {
    public char repeatedCharacter(String s) {
        int [] hp = new int[26];

        for(int i=0;i<s.length();i++){
            hp[s.charAt(i)-'a']++;
            if(hp[s.charAt(i)-'a']==2){
                return s.charAt(i);
            }
        }
       
        return 0;
    }
}