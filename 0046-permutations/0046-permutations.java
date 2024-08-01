class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<>(),nums);
        return ans;
    }

    public static void solve(List<List<Integer>> ans, List<Integer> temp, int[] nums){

       if(temp.size() == nums.length){
        ans.add(new ArrayList<>(temp));
        return;
       }

        for(int num : nums){
            if(temp.contains(num))
            continue;
        
            temp.add(num);

            solve(ans,temp,nums);
            temp.remove(temp.size() - 1);
        }
        
    }
}