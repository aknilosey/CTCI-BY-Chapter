public class CTCI410 {
    public static boolean isSubTree(TreeNode tree1, TreeNode tree2)  {
        StringBuilder firstString = new StringBuilder();
        StringBuilder secondString = new StringBuilder();
        
        preOrderHelper(tree1, firstString);
        preOrderHelper(tree2, secondString);

        if (!(firstString.toString()).contains(secondString.toString())) {
            return false;
        }
        return true;


    }

    private static void preOrderHelper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("X");
            return;
        }
        else {
            sb.append(root.value);
            preOrderHelper(root.left, sb);
            preOrderHelper(root.right,sb);
        }

    }

    public static void main(String[] args) {
        
        TreeNode tree1 = new TreeNode (12); 
        tree1.left = new TreeNode(8);
        tree1.right = new TreeNode(20);
        tree1.left.left = new TreeNode(5);
        tree1.left.right = new TreeNode(11);
        tree1.right.right = new TreeNode(25);
      
        
        TreeNode tree2 = new TreeNode (8); 
        tree2.left = new TreeNode(5);
        tree2.right = new TreeNode(11);
        System.out.println(isSubTree(tree1,tree2));
    }
}
