public class CTCI24{
    public void partitionLinkedList(ListNode head, int partitionVal) {
        ListNode beforePartitionHead = null;
        ListNode afterPartitionHead = null;
        beforePartitionHead = beforePartitionTraverse;
        afterPartitonHead = afterPartitionTraverse;
        head = traverse;
        
        while (traverse != null) {
        
            if (traverse.val < partitionVal) {
                beforePartitionTraverse.next.value = traverse.value;
               // beforePartitionTraverse = beforePartitionTraverse.next;
            }
            else if (traverse.val >= partitionVal) {
                afterPartitionTraverse.next.value = traverse.value;
                //afterPartitionTraverse = afterPartitionTraverse.next;
            }
            
            traverse = traverse.next;
        }

        beforePartitionTraverse.next = afterPartitionHead;

    }
}
