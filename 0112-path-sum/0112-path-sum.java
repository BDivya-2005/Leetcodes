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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        Stack<TreeNode>node=new Stack<>();
        Stack<Integer>sum=new Stack<>();

        node.push(root);
        sum.push(root.val);

        while(!node.isEmpty()){
            TreeNode n=node.pop();
            int s=sum.pop();

            if(n.left==null&&n.right==null&&s==targetSum){
                return true;
            }

            if(n.right!=null){
                node.push(n.right);
                sum.push(s+n.right.val);
            }

            if(n.left!=null){
                node.push(n.left);
                sum.push(s+n.left.val);
            }

        }
        return false;
    }
}