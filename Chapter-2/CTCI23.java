public class CTCI23 {
    
    public boolean deletenode(ListNode mid) {
        if (mid == null || mid.next == null) {
            return false;
        }

        mid.value = mid.next.value;
        mid.next = mid.next.next;
        return true;
    }
}
