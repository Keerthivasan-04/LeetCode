class Solution {

    public static void solve(int i, int n, List<List<Integer>> ans, List<Integer> op, int[] nums){
        if(i == n){
            ans.add(new ArrayList<>(op));
            return;
        }

        List<Integer> op1 = new ArrayList<>(op);
        List<Integer> op2 = new ArrayList<>(op);
        op2.add(nums[i]);
        i++;
        solve(i,n,ans,op1,nums);
        solve(i,n,ans,op2,nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        int n = nums.length;
        solve(0,n,ans,op,nums);
        return ans;
    }
}