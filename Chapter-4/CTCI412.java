public class CTCI412 {
    public static int pathWithSum(TreeNode root, int target) {
        if (root == null) {
            return 0;
        }
        int rootCount = pathSumHelper(root,target,0);
        int leftCount = pathWithSum(root.left, target);
        int rightCount = pathWithSum(root.right, target);

        return rootCount+leftCount+rightCount;
    }
    
    private static int pathSumHelper(TreeNode root, int targetSum, int currentSum) {
        
        if (root == null) {
            return 0;
        }
        int pathCount = 0;
        currentSum += root.value;

        if (targetSum == currentSum) {
            pathCount +=1;
        }

        pathCount += pathSumHelper(root.left, targetSum, currentSum);
        pathCount += pathSumHelper(root.right, targetSum, currentSum);

        return pathCount;
    }
    public static void main(String[] args) {
    
        TreeNode tree = new TreeNode(15);
        tree.left = new TreeNode(-8);
        tree.right = new TreeNode(-20);
        tree.left.left = new TreeNode(-5);
        tree.right.right = new TreeNode(5);
        System.out.println(pathWithSum(tree, 0));
    }
}
