package Chapter3;

import java.util.Random;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 7:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB3_6 {

    public static Stack<Integer> oldStack = new Stack<Integer>();
    public static Stack<Integer> newStack = new Stack<Integer>();

    public static void insertUnsortedItems(){
        for(int i=0; i<15; i++){
            int elem = new Random().nextInt(20) + 1;
            oldStack.push(elem);
            System.out.println("Pushed Item: " + elem);
        }
    }

    public static Stack sortStack(Stack<Integer> old){
        while(!old.isEmpty()){
            int oldItem = old.pop();
            while(!newStack.isEmpty() && oldItem < newStack.peek()){
                old.push(newStack.pop());
            }
            newStack.push(oldItem);

        }
        return newStack;
    }

    public static void printStack(Stack<Integer> stack){
        System.out.println("Ascending Sorted Stack: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + "; ");
        }
    }

    public static void main(String [] args) {
        insertUnsortedItems();
        Stack<Integer> n = sortStack(oldStack);
        printStack(n);

    }

}
