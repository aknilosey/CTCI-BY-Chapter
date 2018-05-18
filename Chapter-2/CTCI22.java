public class CTCI22 {

        public ListNode kToLastElement (ListNode head, int k) {
            ListNode helper = head;
            for (int i = 0; i < k; i++ ) {
                if (head == null) {
                    return null;
                }
                head = head.next;
            }

            while (head != null) {
                head = head.next;
                helper = helper.next;
            }
        return helper;

        }
}
