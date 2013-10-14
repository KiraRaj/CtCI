package Chapter2;

import CtCILibrary.LinkedListNode;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/13/13
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB2_4 {

    public static LinkedListNode divideLinkedList(LinkedListNode head, int division){

        LinkedListNode smallHead = null;
        LinkedListNode smallEnd = null;
        LinkedListNode largeHead = null;
        LinkedListNode largeEnd = null;

        while(head != null){
            LinkedListNode next = head.next;
            head.next = null;
            if(head.data < division){
                if(smallHead == null){
                    smallHead = head;
                    smallEnd = smallHead;
                }
                else{
                    smallEnd.next = head;
                    smallEnd = smallEnd.next;
                }
            }
            else{
                if(largeHead == null){
                    largeHead = head;
                    largeEnd = largeHead;
                }
                else{
                    largeEnd.next = head;
                    largeEnd = largeEnd.next;
                }
            }
            head = next;
        }

        if(smallHead == null)
            return largeHead;

        smallEnd.next = largeHead;
        return smallHead;

    }

    public static void main(String[] args) {
        LinkedListNode first = new LinkedListNode(0);
        LinkedListNode head = first;
        LinkedListNode second = first;
        for (int i = 1; i < 8; i++) {
            second = new LinkedListNode(new Random().nextInt(10));
            first.setNext(second);
            second.setPrev(first);
            first = second;
        }

        System.out.println(head.printForward());

        int index = 6;

        System.out.println("The division value is " + index);

        LinkedListNode newHead = divideLinkedList(head, index);
        System.out.println("The new LinkedList is: " + newHead.printForward());

    }
}
