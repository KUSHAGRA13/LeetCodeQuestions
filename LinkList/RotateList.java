package LinkList;

/**
 * Q61
 */
public class RotateList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode start = new RotateList().rotateRight(head, 1);
        while (start != null) {
            System.out.println(start.val);
            start = start.next;
        }

    }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode start = head, lastNode = head, newStartNode = head;
        int totalNoOfNode = 0;

        if (head == null)
            return null;
        while (start != null) {
            totalNoOfNode++;
            lastNode = start;
            start = start.next;
        }
        if (k >= totalNoOfNode)
            k = k % totalNoOfNode;

        if (k == 0)
            return head;
        k = totalNoOfNode - k;
        start = head;
        for (int i = 1; i < k; i++) {
            start = start.next;
            newStartNode = start.next;
        }
        if (k==1)
            newStartNode = start.next;
        start.next = null;
        lastNode.next = head;


        return newStartNode;
    }
}
