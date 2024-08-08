class Solution {
    public String defangIPaddr(String address) {

        StringBuilder s1 = new StringBuilder();
        String s2 = "[.]";


        for(int i = 0; i < address.length(); i++){

            char ch = address.charAt(i);
            if(ch == '.'){
                s1.append(s2);
            }
            else{
                s1.append(ch);
            }
        }

        return s1.toString();
    }
}