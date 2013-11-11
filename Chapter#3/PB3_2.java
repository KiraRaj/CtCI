package Chapter3;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/29/13
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB3_2 {

    // size of stack
    final static int stackSize = 20;

    static int[] stack = new int[stackSize];
    static int stackPoint = -1;

    // a stack to record minimum value
    static int[] minValue = new int[stackSize];
    static int minValuePoint = -1;


    // push function
    public static void push(int value){

        stackPoint++;
        stack[stackPoint] = value;


        if(minValuePoint == -1){
            minValuePoint++;
            minValue[minValuePoint] = value;
        }
        else{
            if(value < minValue[minValuePoint]){
                minValuePoint++;
                minValue[minValuePoint] = value;
            }
        }

    }

    // pop function
    public static int pop(){

        int value = stack[stackPoint];
        if(value == minValue[minValuePoint]){
            minValuePoint--;
        }
        stackPoint--;
        return value;
    }

    // peek function
    public static int peek(){

        return stack[stackPoint];
    }

    // min function
    public static int min(){
        if(minValuePoint != -1)
            return minValue[minValuePoint];
        System.out.println("The stack is empty");
        return -1;
    }

    // isEmpty function
    public static boolean isEmpty(){
        return stackPoint == -1;
    }

    public static void main(String[] args){

        for(int i=0; i<15; i++){
            int value = new Random().nextInt(20) + 1;
            push(value);
            System.out.print(value + "; ");
        }
        System.out.println();
        for(int i=0; i<minValue.length; i++){
            if(minValue[i] != 0)
                System.out.print(minValue[i] + "; ");
        }
        System.out.println();

        for(int i=0; i<15; i++){
            System.out.print("Poped Item: " + pop());
            System.out.println("\tCurrent min value is: " + min());
        }
    }
}
