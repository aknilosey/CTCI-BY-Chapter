import java.util.LinkedList;
import java.util.ArrayList;
import java.lang.*;
public class CTCI43 {

    public static void LeveledLists(TreeNode root) {
    ArrayList<LinkedList<TreeNode>> result = new ArrayList<>();
    LinkedList<TreeNode> current = new LinkedList<TreeNode>();
    if (root != null) {
        current.add(root);
    }
    while (current.size() > 0) {
        result.add(current);
        LinkedList<TreeNode> parents = current;
        current = new LinkedList<>();
        for (TreeNode parent:parents) {
            if (parent.left != null) {
                current.add(parent.left);
            }
            if (parent.right != null) {
                current.add(parent.right);
            }
        }
    }
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.right = new TreeNode(7);
        LeveledLists(tree);
        
    }
}
