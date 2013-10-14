package Chapter2;

import CtCILibrary.LinkedListNode;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/14/13
 * Time: 5:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB2_6 {

    public static LinkedListNode reverseLinkedList(LinkedListNode head){
        LinkedListNode pre = null;
        LinkedListNode current = head;
        LinkedListNode next = head.next;

        while(next != null){
            current.next = pre;
            pre = current;
            current = next;
            next = next.next;
        }

        current.next = pre;

        return current;
    }

    public static String transferLinkedLintToStringBuffer(LinkedListNode head){
        String buf = "";
        while(head.next != null){
            buf += head.data;
            head = head.next;
        }
        buf += head.data;

        return buf;
    }

    public static boolean palindrome(LinkedListNode head){

        String originalList = transferLinkedLintToStringBuffer(head);
        LinkedListNode reverse = reverseLinkedList(head);
        String reverseList = transferLinkedLintToStringBuffer(reverse);

        System.out.println(originalList + " ; " + reverseList);

        if (originalList.equals(reverseList)) return true;
        else return false;
    }

    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(9, null, null);
        LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        LinkedListNode lC1 = new LinkedListNode(1, null, null);
        LinkedListNode lC2 = new LinkedListNode(4, null, lC1);
        LinkedListNode lC3 = new LinkedListNode(7, null, lC2);
        LinkedListNode lC4 = new LinkedListNode(3, null, lC3);
        LinkedListNode lC5 = new LinkedListNode(7, null, lC4);
        LinkedListNode lC6 = new LinkedListNode(4, null, lC5);
        LinkedListNode lC7 = new LinkedListNode(1, null, lC6);

        System.out.println(lA3.printForward() + ": " + palindrome(lA3));
        System.out.println(lB3.printForward() + ": " + palindrome(lB3));
        System.out.println(lC7.printForward() + ": " + palindrome(lC7));

    }


}
