class Solution {
    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        dfspost(root);
        return max;
    }

    public int dfspost(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftpath = dfspost(root.left);    // child ability
        int rightpath = dfspost(root.right);  // child ability

        int left = 0, right = 0;              // usable at current node

        if (root.left != null && root.left.val == root.val) {
            left = leftpath + 1;
        }

        if (root.right != null && root.right.val == root.val) {
            right = rightpath + 1;
        }

        // path passing through this node
        max = Math.max(max, left + right);

        // path extending upward
        return Math.max(left, right);
    }
}
