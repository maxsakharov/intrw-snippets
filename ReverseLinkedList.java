public class ReverseLinkedList {

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode prev = null;

        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }

        return prev;
    }
}