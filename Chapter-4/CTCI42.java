import java.lang.*;
public class CTCI42 {
    public static  TreeNode BalancedBST(int[] array, int start, int end) {
        if(end < start) {
            return null;
        }
        int mid = (start+end)/2;
        TreeNode tree = new TreeNode(array[mid]);
        tree.left = BalancedBST(array,start,mid-1);
        tree.right = BalancedBST(array,mid+1,end);
        return tree;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
    }
}
