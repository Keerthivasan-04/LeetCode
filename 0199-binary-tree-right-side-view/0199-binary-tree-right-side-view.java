/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int n = q.size();
            List<Integer> lvl = new ArrayList<>();

            for(int i = 0;i < n;i++){
                TreeNode f = q.poll();

                // if(i == n-1){
                //     lvl.add(f.val);
                // }
                if(f.left != null){
                    q.add(f.left);
                }
                if(f.right != null){
                    q.add(f.right);
                }
                lvl.add(f.val);
            }
            ans.add(lvl.get(lvl.size()-1));
        }
        return ans;
    }
}