import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;


public class CTCI49 {

    
    public static ArrayList<LinkedList<Integer>> allSequence(TreeNode root) {
         ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
         LinkedList<Integer> prefix = new LinkedList<Integer>();
        if ( root == null) {
            result.add(new LinkedList());
            return result;
        }
        
        prefix.add(root.value);
        ArrayList<LinkedList<Integer>> leftSequence = allSequence(root.left);
        ArrayList<LinkedList<Integer>> rightSequence = allSequence(root.right);

        for(LinkedList<Integer> left : leftSequence) {
            for (LinkedList<Integer>right : rightSequence) {
                ArrayList<LinkedList<Integer>> helperList = new ArrayList<LinkedList<Integer>>();
                allSequenceHelper(left, right, helperList, prefix);
                result.addAll(helperList);
            }
        }
        return result;
    }

    private static void allSequenceHelper(LinkedList<Integer> first, LinkedList<Integer> second, ArrayList<LinkedList<Integer>> helperList, LinkedList<Integer> prefix ) {
    if (first.size() == 0 || second.size() ==0) {
        LinkedList<Integer> smallerList = (LinkedList<Integer>) prefix.clone();
        smallerList.addAll(first);
        smallerList.addAll(second);
        helperList.add(smallerList);
        return;
    }

    int headFirst = first.removeFirst();
    prefix.addLast(headFirst);
    allSequenceHelper(first,second,helperList,prefix);
    prefix.removeLast();
    first.addFirst(headFirst);
    
    int headSecond = second.removeFirst();
    prefix.addLast(headSecond);
    allSequenceHelper(first,second,helperList,prefix);
    prefix.removeLast();
    second.addFirst(headSecond);
    }

    public static void main(String[] args) {
                
        TreeNode tree = new TreeNode(15);
        tree.left = new TreeNode(8);
        tree.right = new TreeNode(20);
        tree.left.left = new TreeNode(5);
        tree.right.right = new TreeNode(25);
        System.out.println(Arrays.toString(allSequence(tree).toArray()));
    }
}



