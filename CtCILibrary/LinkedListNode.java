package CtCILibrary;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/13/13
 * Time: 4:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListNode {

    public int data;
    public LinkedListNode prev;
    public LinkedListNode next;
    public LinkedListNode last;

    public LinkedListNode(int d){
        data = d;
    }

    public LinkedListNode(int d, LinkedListNode p, LinkedListNode n){
        data = d;
        prev = p;
        next = n;
    }

    public void setData(int d){
        this.data = d;
    }

    public void setPrev(LinkedListNode p){
        this.prev = p;
    }

    public void setNext(LinkedListNode n){
        this.next = n;
    }

    public String printForward(){
        if (next != null) {
            return data + "->" + next.printForward();
        } else {
            return ((Integer) data).toString();
        }
    }
}
