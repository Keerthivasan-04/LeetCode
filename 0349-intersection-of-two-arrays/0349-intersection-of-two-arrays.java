class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> l = new HashSet<Integer>();
        HashSet<Integer> m = new HashSet<Integer>();
        for(int i : nums1)
        {
            l.add(i);
        }
        for(int i : nums2)
        {
            if(l.contains(i)){
                m.add(i);
            }
        }
        int[] y = new int[m.size()];
        int i = 0;
        
        for(int e : m){
            y[i++] = e;
        }
       
        return y;


        
    }
}