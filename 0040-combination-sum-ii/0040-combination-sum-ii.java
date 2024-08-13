class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);

        help(target,0,candidates,ans,temp);
        return ans;

    }

    void help(int target, int idx, int[] candidates,List<List<Integer>> ans,List<Integer> temp){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = idx; i < candidates.length; i++){
            if(i>idx && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            temp.add(candidates[i]);
            help(target - candidates[i], i+1, candidates,ans,temp);
            temp.removeLast();
        }
    }
}