public class CTCI21 {
    /*In this solution, we donot use an extra data structure to store values,
      hence two loops are required, if the list was sorted, we could have
      solved it is O(n) time*/

    public void removeDups (ListNode unsortedList) {
        ListNode head = unsortedList;
        while (head != null) {  
            ListNode runner = head;
            while (runner.next != null) {
                if (runner.value == head.value) {
                    runner.next = runner.next.next;
                }   
                else {
                    head = head.next;
                }
            }
            head = head.next;
        }
    }
}   


