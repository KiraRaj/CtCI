package Chapter3.PB3_3;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stack {

    public int capacity;
    public int size = 0;
    public Node bottom;
    public Node top;

    // Construction function
    public Stack(int cap){
        this.capacity = cap;
    }

    // isEmpty function
    public boolean isEmpty(){
        return size == 0;
    }

    // isFull function
    public boolean isFull(){
        return size == capacity;
    }

    // push function
    public boolean push(int value){
        if(size >= capacity)
            return false;

        size++;
        Node newNode = new Node(value);
        if(size == 0){
            bottom = newNode;
            top = newNode;
        }
        else{
            newNode.prev = top;
//            top.next = newNode;
            top = newNode;
        }
        return true;
    }

    // pop function
    public int pop(){
        int value = top.value;
        top = top.prev;
        size--;
        return value;
    }

    // peek function
    public int peek(){
        return top.value;
    }

}
