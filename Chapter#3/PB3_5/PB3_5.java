package Chapter3.PB3_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB3_5 {

    public static void main(String[] args){
        MyQueue myQueue = new MyQueue();
        Queue queue = new LinkedList();

        for(int i=0; i<16; i++){
            int elem = new Random().nextInt(20)+1;
            myQueue.enqueue(elem);
            queue.add(elem);
            System.out.println("Enqueued Item: " + elem);
        }

        System.out.println();

        System.out.println("Real Queue Dequeue: ");
        while(!queue.isEmpty()){
            System.out.print(queue.peek() + "; ");
            queue.remove();
        }

        System.out.println();
        System.out.println("MyQueue Dequeue: ");
        while(!myQueue.isEmpty()){
            System.out.print(myQueue.dequeue() + "; ");
        }
    }
}
