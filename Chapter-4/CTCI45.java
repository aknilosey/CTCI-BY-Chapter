public class CTCI45 {
    public static boolean isBinarySearchTree (TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if ((min != null && root.value <=min) || (max !=null && root.value > max)) {
            return false;
        }
        if ((!isBinarySearchTree(root.left, min, root.value)) || (!isBinarySearchTree(root.right, root.value, max))) {
            return false;
        }
        return true;
    }
    public static void main (String[] args) {
        TreeNode tree = new TreeNode(15);
        tree.left = new TreeNode(8);
        tree.right = new TreeNode(20);
        tree.left.left = new TreeNode(25);
        tree.right.right = new TreeNode(25);
        System.out.println(isBinarySearchTree(tree, null, null));
    }
}
