class Solution {
    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;

        bstToGst(root.right);   // visit larger values first

        sum += root.val;        // add current value to running sum
        root.val = sum;         // update node

        bstToGst(root.left);    // then smaller values

        return root;
    }
}