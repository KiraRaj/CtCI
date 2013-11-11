package Chapter3;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/29/13
 * Time: 7:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB3_1 {

    // the static stack space
    final static int stackSize = 15;

    // a large enough array;
    static int[] stack = new int[stackSize * 4];

    // three stack point pointing to each stack head
    static int[] stackPoint = {-1, -1, -1};


    // push function
    public static void push(int stackNum, int value){

        stackPoint[stackNum]++;
        stack[realPointOfStack(stackNum)] = value;
    }

    // produce the real corresponding pointer address of the stack
    public static int realPointOfStack(int stackNum){

        return stackNum * stackSize + stackPoint[stackNum];
    }

    // pop function
    public static int pop(int stackNum){

        int value = stack[realPointOfStack(stackNum)];
        stack[realPointOfStack(stackNum)] = 0;
        stackPoint[stackNum]--;
        return value;
    }

    // peek function
    public static int peek(int stackNum){

        int value = stack[realPointOfStack(stackNum)];
        return value;
    }

    // isEmpty function
    public static boolean isEmpty(int stackNum){
        return stackPoint[stackNum] == -1;
    }

    public static void main(String[] args){
        push(2, 4);
        System.out.println("Peek 2: " + peek(2));
        push(0, 3);
        push(0, 7);
        push(0, 5);
        System.out.println("Peek 0: " + peek(0));
        pop(0);
        System.out.println("Peek 0: " + peek(0));
        pop(0);
        System.out.println("Peek 0: " + peek(0));
    }
}
