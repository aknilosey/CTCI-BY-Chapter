public class CTCI44 {
    public static int BalancedTree(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = 1 + BalancedTree(root.left);
        int rightHeight = 1 + BalancedTree(root.right);
        int heightDiff = leftHeight - rightHeight;
        if ( Math.abs(heightDiff) >1) {
            return Integer.MIN_VALUE;
        }
        else {
            return Math.max(leftHeight, rightHeight);
        }
    }
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        //tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        //tree.right.right = new TreeNode(7);
        int isBalanced = BalancedTree(tree);
        System.out.println( ( ( isBalanced - Integer.MIN_VALUE ) == 0) ? false : true );
    }
}
