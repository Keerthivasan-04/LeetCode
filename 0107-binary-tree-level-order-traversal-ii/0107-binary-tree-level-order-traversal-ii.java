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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrderTraversal(root,ans);
        Collections.reverse(ans);
        return ans;
    }

    void levelOrderTraversal(TreeNode root, List<List<Integer>> ans){
        if(root == null){
            return ;
        }
        Queue <TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> lvl = new LinkedList<>();

            for(int i=0;i<n;i++){
                TreeNode f = q.poll();
                lvl.add(f.val);
                if(f.left!=null){
                    q.add(f.left);
                }
                if(f.right!=null){
                    q.add(f.right);
                }
            }
            ans.add(lvl);
        }
    }
}