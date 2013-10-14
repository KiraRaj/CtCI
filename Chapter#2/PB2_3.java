package Chapter2;

import CtCILibrary.LinkedListNode;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/13/13
 * Time: 8:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB2_3 {

    public static void deleteMiddleNode(LinkedListNode middle){
        LinkedListNode next = middle.next;

        middle.data = next.data;
        middle.next = next.next;
        next.next.prev = middle;
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

        int index = new Random().nextInt(5);
        LinkedListNode middle = head;

        for(int i=0; i<index-1; i++){
            middle = middle.next;
        }
        System.out.println("The index is " + index + " and the middle node is: " + middle.data);

        deleteMiddleNode(middle);
        System.out.println("The new LinkedList is: " + head.printForward());

    }
}
