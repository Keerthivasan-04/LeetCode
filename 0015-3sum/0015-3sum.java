class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(n);

        for(int i = 0; i < n.length - 2; i ++){
            int l = i + 1;
            int r = n.length - 1;

            while(l < r){
                int sum = n[i] + n[l] + n[r];
                if(sum == 0){
                    res.add(Arrays.asList(n[i],n[l],n[r]));
                    l++;
                    r--;
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}