package Chapter2;

import CtCILibrary.LinkedListNode;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/13/13
 * Time: 6:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB2_2 {

    public static LinkedListNode nthToLast_self(LinkedListNode head, int index){

        int actual = index - 1;

        while(actual > 0){
            head = head.next;
            actual--;

        }

        return head;

    }

    public static int nthToLast(LinkedListNode head, int k){
        if(head == null)
            return 0;

        int recursive = nthToLast(head.next, k) + 1;

        if(recursive == k)
            System.out.println("From nthToLast: the data of " + k + "th to last node is " + head.data);

        return recursive;
    }

    /* Create a Wrap Class, contains both the node's information and index so that recursive on the index
    * and return the node.*/

    /* Functions without recursion */
    /* Two Points: p1, p2; p2=p1+k, and those two pointers move simultaneously.
     * When p2 hits the end of LinkedList, p1 will be the node we need. */
    public static LinkedListNode nthToLastIterative(LinkedListNode head, int k){

        LinkedListNode p1 = head;
        LinkedListNode p2 = head;

        //Move p2 k steps
        for(int i=0; i<k-1; i++){
            if(p2 == null)
                return null;
            p2 = p2.next;
        }

        while(p2.next != null){
            p2 = p2.next;
            p1 = p1.next;
        }

        return p1;

    }


    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(0);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(new Random().nextInt(5));
            first.setNext(second);
            second.setPrev(first);
            first = second;
        }

        System.out.println(head.printForward());
        //LinkedListNode clone = head.clone();
        LinkedListNode newHead = nthToLast_self(head, 3);
        System.out.println(newHead.printForward());

        int index = new Random().nextInt(5);

        //nthToLast
        int recursive = nthToLast(head, index);
        System.out.println("The recursive times of nthToLast() is: " + recursive);

        //nthToLastIterative

        LinkedListNode iterative = nthToLastIterative(head, index);
        System.out.println("From nthToLastIterative: the needed " + index + "th node is: " + iterative.data);

    }
}
