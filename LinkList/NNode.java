package LinkList;

import java.util.List;

public class NNode {

    public static void main(String[] args) {
        ListNode lst = new ListNode(1);
        lst.next = new ListNode(2);
        lst.next.next = new ListNode(3);
        lst.next.next.next = new ListNode(4);
        lst.next.next.next.next = new ListNode(5);

        ListNode head = new NNode().removeNthFromEnd(lst, 2);
        while(head!=null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int noOfNodes = length(head);
        int start = noOfNodes-n+1;
        ListNode startNode = head, prevNode=null;
        for(int i=2;i<=start;i++) {
            prevNode = startNode;
            startNode = startNode.next;
        }

        if(start ==1) {
            head = head.next;
        }
        else {
        prevNode.next = startNode.next; }
        return head;
    }

    private int length(ListNode head) {
        int result =0;
        ListNode start = head;
        while(start!=null) {
            result++;
            start = start.next;
        }
        return result;
    }
}
