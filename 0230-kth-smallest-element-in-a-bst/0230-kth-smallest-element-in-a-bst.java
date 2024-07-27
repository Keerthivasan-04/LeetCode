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

    int ans = 0;
    ArrayList<Integer> arr = new ArrayList<>();

    void inorder(TreeNode root,  int k){
        if(root == null){
            return ;
        }
        inorder(root.left,k);
        arr.add(root.val);
        if(arr.size()==k){
            ans = root.val;
            return;
        }
        inorder(root.right,k);
    }


    public int kthSmallest(TreeNode root, int k) {

        if(root == null){
            return 0;
        }
        
        inorder(root,k);
        return ans;
    }
}