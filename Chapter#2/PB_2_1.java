package Chapter2;

import CtCILibrary.LinkedListNode;

import java.util.Hashtable;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/13/13
 * Time: 5:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB_2_1 {

    public static void removeDuplicate(LinkedListNode head){

        Hashtable hash = new Hashtable();
        LinkedListNode orig = null;

        while(head != null){
            if(hash.containsKey(head.data)){
                orig.next = head.next;
                //head.next.prev = head.prev;
            }
            else{
                hash.put(head.data, true);
                orig = head;
            }
            head = head.next;
        }

        //System.out.println(orig.printForward());

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
        removeDuplicate(head);
        System.out.println(head.printForward());
    }
}

