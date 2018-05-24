import java.util.HashMap;
public class CTCI411 { 
    public static int pathWithSum(TreeNode root, int target ) {

        return pathSumHelper(root, target, 0, new HashMap<Integer,Integer>());
    }
    
    private static int pathSumHelper(TreeNode root, int target, int runningSum, HashMap<Integer, Integer> sumStore) {
        
        if (root == null) {
            return 0;
        }
        runningSum += root.value;
        int sum = runningSum - target;
        int count = sumStore.getOrDefault(sum,0);
        if ( runningSum == target ) { 
            count += 1;
        }
        hashMapHelper(runningSum, sumStore, 1);
        count += pathSumHelper(root.left, target, runningSum, sumStore);
        count += pathSumHelper(root.right, target, runningSum, sumStore);
        hashMapHelper(runningSum, sumStore, -1);    
        return count;
    }
    
    private static void hashMapHelper(int runningSum, HashMap<Integer, Integer> sumStore, int storeCount) {
        int currCount = sumStore.getOrDefault(runningSum,0) + storeCount;
        if (currCount == 0) {
            sumStore.remove(runningSum); 
        }
        else {
            sumStore.put(runningSum, currCount);
        }
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
