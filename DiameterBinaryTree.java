import javax.swing.tree.TreeNode;

public class DiameterBinaryTree {


    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res[] = {Integer.MIN_VALUE};
        diameter(root, res);
        return res[0];
    }
    private int diameter(TreeNode root, int[] result) {
        if (root == null) {
            return 0;
        }
        int left = diameter(root.left, result);
        int right = diameter(root.right, result);
        result[0] = Math.max(result[0], left + right);

        return Math.max(left, right) + 1;
    }
}

