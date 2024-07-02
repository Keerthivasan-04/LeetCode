class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        ArrayList<int[]> l = new ArrayList<>();

        int[] pre = intervals[0];
        for(int i=1;i<intervals.length;i++){
            int [] interval = intervals[i];
            if(interval[0]<=pre[1]){
                pre[1] = Math.max(pre[1],interval[1]);
            }
            else{
                l.add(pre);
                pre = interval;
            }
        }
        l.add(pre);
        return l.toArray(new int[l.size()][]);
        
    }
}