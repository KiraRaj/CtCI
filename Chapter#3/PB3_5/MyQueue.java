package Chapter3.PB3_5;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 7:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyQueue {

    public Stack<Integer> enqueue;
    public Stack<Integer> dequeue;

    public MyQueue(){
        enqueue = new Stack<Integer>();
        dequeue = new Stack<Integer>();
    }

    public int size(){
        return enqueue.size() + dequeue.size();
    }

    public void enqueue(int value){
        enqueue.push(value);
    }

    public void transferQueue(){
        if(dequeue.isEmpty()){
            while(!enqueue.isEmpty()){
                int elem = enqueue.pop();
                dequeue.push(elem);
            }
        }
    }

    public int dequeue(){
        transferQueue();
        return dequeue.pop();
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }
}
