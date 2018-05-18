public class CTCI25{
    public void sumLL(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode l3 = null;
        while (l1 != null || l2 != null) {
            int x = (l1 != null ? l1.value : 0);
            int y = (l2 != null ? l2.value: 0);
            sum = carry + x + y;
            l3.value = sum % 10; 
            carry = sum / 10;
            l3 = l3.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if ( carry > 0 ) {
            l3.value = carry;
        }
        
    }


}
