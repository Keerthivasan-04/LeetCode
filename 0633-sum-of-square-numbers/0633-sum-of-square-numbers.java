class Solution {
    public boolean judgeSquareSum(int c) {
        int high = (int) Math.sqrt(c);

        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<=high ;i++){
            h.add(i*i);
        }
        for(int i=0;i<=high;i++){
            int w = c - (i*i);
            if(h.contains(w)){
                return true;
            }
        }
        return false;
    }
}