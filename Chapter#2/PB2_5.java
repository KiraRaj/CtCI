package Chapter2;

import CtCILibrary.LinkedListNode;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/13/13
 * Time: 9:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB2_5 {

    public static LinkedListNode addLinkedList(LinkedListNode ll1, LinkedListNode ll2, int sum){

        if(ll1 == null && ll2 == null && sum == 0)
            return null;

        LinkedListNode result =  new LinkedListNode(sum);
        int value = sum;

        if(ll1 != null)
            value += ll1.data;

        if(ll2 != null)
            value += ll2.data;

        result.data = value % 10;

        if(ll1 != null && ll2 != null){
            LinkedListNode next = addLinkedList(
                    ll1==null ? null : ll1.next,
                    ll2==null ? null : ll2.next,
                    value>=10 ? 1 : 0);
            result.next = next;
        }

        return result;

    }

    public static LinkedListNode addReverseLinkedList(LinkedListNode ll1, LinkedListNode ll2, int sum){
        LinkedListNode rll1 = reverseLinkedList(ll1);
        LinkedListNode rll2 = reverseLinkedList(ll2);
        return addLinkedList(rll1, rll2, sum);
    }

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

    public static int transferLinkedLintToInteger(LinkedListNode head){
        int value = 0;
        if(head.next != null){
            value = 10 * transferLinkedLintToInteger(head.next);
        }
        return value + head.data;
    }

    public static void main(String[] args) {
        LinkedListNode lA1 = new LinkedListNode(9, null, null);
        LinkedListNode lA2 = new LinkedListNode(9, null, lA1);
        LinkedListNode lA3 = new LinkedListNode(9, null, lA2);

        LinkedListNode lB1 = new LinkedListNode(1, null, null);
        LinkedListNode lB2 = new LinkedListNode(0, null, lB1);
        LinkedListNode lB3 = new LinkedListNode(0, null, lB2);

        LinkedListNode list3 = addLinkedList(lA3, lB3, 0);

        System.out.println("  " + lA3.printForward());
        System.out.println("+ " + lB3.printForward());
        System.out.println("= " + list3.printForward());

        int l1 = transferLinkedLintToInteger(lA3);
        int l2 = transferLinkedLintToInteger(lB3);
        int l3 = transferLinkedLintToInteger(list3);

        System.out.print(l1 + " + " + l2 + " = " + l3 + "\n");
        System.out.print(l1 + " + " + l2 + " = " + (l1 + l2));
        System.out.println();
        System.out.println();

        /* FOLLOW UP, reverse LinkedList Addition */

        LinkedListNode rlA1 = reverseLinkedList(lA3);
        LinkedListNode rlB1 = reverseLinkedList(lB3);
        //System.out.println(rlB1.printForward());

        LinkedListNode rresult = addLinkedList(rlA1, rlB1, 0);
        //System.out.println(rresult.printForward());

        System.out.println("  " + rlA1.printForward());
        System.out.println("+ " + rlB1.printForward());
        System.out.println("= " + rresult.printForward());

        int rl1 = transferLinkedLintToInteger(rlA1);
        int rl2 = transferLinkedLintToInteger(rlB1);
        int rl3 = transferLinkedLintToInteger(rresult);

        System.out.print(rl1 + " + " + rl2 + " = " + rl3 + "\n");
        System.out.print(rl1 + " + " + rl2 + " = " + (rl1 + rl2));
        System.out.println();

    }
}
