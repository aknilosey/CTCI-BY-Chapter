public class CTCI46 {
    public static int successor(TreeNode root, int x) {
        if (root == null) {
            return 0;
        }
        TreeNode temp = root;
        while (root.value != x) {
            temp.parent = root;
            if (root.value < x) {
                root=root.right;
            }
            else {
                root = root.left;
            }
        }
        if (root.right != null) {
            return MinLeftNode(root.right);
        }
        while (temp != null &&  root == temp.right) {
            root = temp;
            temp = temp.parent;
        }
        return temp.value;
    }

    public static int MinLeftNode(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.value;
    }

    public static void main (String args[]) {
        TreeNode tree = new TreeNode (12); 
        tree.left = new TreeNode(8);
        tree.right = new TreeNode(20);
        tree.left.left = new TreeNode(5);
        tree.right.right = new TreeNode(25);
        System.out.println(successor(tree,8));
    }
}
