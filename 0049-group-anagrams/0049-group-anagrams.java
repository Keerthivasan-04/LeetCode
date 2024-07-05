class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap <String,List<String>> l = new HashMap<>();
        for(String str : strs){
            char[] c =  str.toCharArray();
            Arrays.sort(c);
            String ss = new String(c);
            if(!l.containsKey(ss)){
                l.put(ss,new ArrayList<>());
            }
            l.get(ss).add(str);

            }

        return new ArrayList<>(l.values());
    }
}