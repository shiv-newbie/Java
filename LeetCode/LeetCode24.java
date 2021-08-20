// 24. Swap Nodes in Pairs

import java.io.BufferedInputStream;
import java.util.*;

public class LeetCode24 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode x = new ListNode(0);
        x.next = head;
        ListNode current = x;
        while(current.next != null && current.next.next != null)
        {
            ListNode first = current.next;
            ListNode second = current.next.next;

            first.next = second.next;
            current.next = second;
            current.next.next = first;

            current = current.next.next;
        }

        return x.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode h = head;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(4);

        h = swapPairs(h);

        while(h != null)
        {
            System.out.println(h.val);
            h = h.next;
        }
    }
}
