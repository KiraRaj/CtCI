package Chapter3.PB3_3;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB3_3 {
    public static void main(String[] args) {
        int capacity_per_substack = 5;
        SetOfStacks set = new SetOfStacks(capacity_per_substack);
        for (int i = 0; i < 34; i++) {
            set.push(i);
        }
        System.out.println("After pushing, current stacks number is: " + set.stacks.size());
/*
        for (int i = 0; i < 34; i++) {
            System.out.println("Popped " + set.pop());
        }
*/
        System.out.println(set.popAt(3));
        System.out.println(set.popAt(3));
        System.out.println(set.popAt(3));
        System.out.println(set.popAt(3));
        System.out.println(set.popAt(3));

        System.out.println(set.popAt(3));
    }
}
