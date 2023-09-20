package LinkList;

import java.util.List;

public class SwapNodes {


    public static void main(String[] args) {
        ListNode lst = new ListNode(1);
        lst.next = new ListNode(2);

        lst.next.next = new ListNode(3);
        lst.next.next.next = new ListNode(4);
        /*
        lst.next.next.next.next = new ListNode(5);
*/
        ListNode head = new SwapNodes().swapPairs(lst);
        while(head!=null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
    public ListNode swapPairs(ListNode head) {
        ListNode result = null;
        ListNode first = head;
        ListNode second = head.next, third = null, prev=null;
        if (second != null) {
            third = second.next;
            result = second;
        } else
            return head;

        while (first != null) {
            if(prev !=null) {
                prev.next = second;
            }
            first.next = third;
            second.next = first;

            if (third != null && third.next != null) {
                prev=first;
                first = third;

                second = first.next;
                third = second.next;
            } else
                break;
        }
        return result;
    }

    // Solution using 2 pointers

}
