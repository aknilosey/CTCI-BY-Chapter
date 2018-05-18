import java.util.HashSet;
public class CTCI21a {
    
    public void removeDups (ListNode head) {
        
        HashSet<Integer> visitedNodesStore = new HashSet<>();
        ListNode previous = null;

        while (head != null) {
            if (visitedNodesStore.contains(head.value)) {
                previous.next = head.next;
            }
            else {
                visitedNodesStore.add(head.value);
                previous = head;
            }
            head = head.next;
        }
    }
    
}

