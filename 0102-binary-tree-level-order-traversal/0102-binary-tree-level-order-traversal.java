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

    public int height(TreeNode root){
        if(root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public void printLevel(TreeNode root, int level, List<Integer> list){
        if(root == null)
            return;

        if(level == 1){
            list.add(root.val);
            return;
        }

        printLevel(root.left, level - 1, list);
        printLevel(root.right, level - 1, list);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        int h = height(root);

        for(int i = 1; i <= h; i++){
            List<Integer> level = new ArrayList<>();
            printLevel(root, i, level);
            ans.add(level);
        }

        return ans;
    }
}