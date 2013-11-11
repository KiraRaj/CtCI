package Chapter3.PB3_3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class SetOfStacks {

    ArrayList<Stack> stacks = new ArrayList<Stack>();
    public int capacity;


    public SetOfStacks(int cap){
        this.capacity = cap;
    }

    // get the current stack to operate push() and pop()
    public Stack getLastStack(){
        if(stacks.size() == 0)
            return null;
        return stacks.get(stacks.size()-1);
    }

    // push(): if normal, push to specific stack; else, create a new stack and push to it
    public void push(int value){
        Stack last = getLastStack();

        if(last != null && !last.isFull())
            last.push(value);
        else{
            Stack newLast = new Stack(capacity);
            newLast.push(value);
            stacks.add(newLast);
        }

    }

    // pop(): get the current stack and pop
    public int pop(){
        Stack last = getLastStack();
        int value = last.pop();

        if(last.isEmpty())
            stacks.remove(stacks.size()-1);

        return value;
    }

    // popAt(int index): pop the value of a specific stack
    public int popAt(int index){
        Stack spec = getSpecificStack(index);
        int value = spec.pop();

        if(spec.isEmpty()){
            stacks.remove(index-1);
            System.out.println("Stack " + index + " is removed, the total stack number is: " + stacks.size());
        }
        return value;
    }

    public Stack getSpecificStack(int index){
        if(stacks.size() == 0)
            return null;
        return stacks.get(index-1);

    }
}
