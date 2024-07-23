/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        if(root != null){
            preOrder(root,arr);
        }
        return arr;
    }
     
    void preOrder(Node root , ArrayList<Integer> arr){
        arr.add(root.val);
        for(Node c : root.children){
            if(c != null){
                preOrder(c,arr);
            }
        }
    }   
}
