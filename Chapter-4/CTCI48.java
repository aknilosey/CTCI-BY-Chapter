public class CTCI48 {
    public static int lowestCommonAncestor(TreeNode root, TreeNode firstNum, TreeNode secondNum) {
        if (root == null) {
            return 0;
        }

        if (root.value > firstNum.value && root.value > secondNum.value){
            return(lowestCommonAncestor(root.left, firstNum, secondNum));
        }
        if (root.value < firstNum.value && root.value < secondNum.value){
            return(lowestCommonAncestor(root.right, firstNum, secondNum));
        }
        return root.value;
    }

    public static void main(String[] args) { 
        TreeNode tree = new TreeNode(15);
        tree.left = new TreeNode(8);
        tree.right = new TreeNode(20);
        tree.left.left = new TreeNode(5);
        tree.right.right = new TreeNode(25);
        TreeNode firstNum = new TreeNode(8);
        TreeNode secondNum = new TreeNode(5);
        System.out.println(lowestCommonAncestor(tree, firstNum, secondNum));
    }
}
