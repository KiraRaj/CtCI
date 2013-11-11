package Chapter3.PB3_4;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 4:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class HanoiTower {

    public Stack<Integer> disks;
    public int index;

    public HanoiTower(int i){
        index = i;
        disks = new Stack<Integer>();
    }

    public int getIndex(){
        return this.index;
    }

    public void addDisk(int d){
        if(!disks.isEmpty() && disks.peek() <= d){
            System.out.println("Error to place on disk " + d);
        }
        else
            disks.push(d);
    }

    public void moveTopToTower(HanoiTower t){
        int top = disks.pop();
        t.addDisk(top);
    }

    public void print(){
        System.out.println("Contents of Tower " + getIndex() + ": " + disks.toString());
    }

    public void moveDisks(int n, HanoiTower dest, HanoiTower buf){
        if(n>0){
            //String tag = "move_" + n + "_disks_from_" + this.index + "_to_" + dest.index + "_with_buffer_" + buf.index;
            //System.out.println("<" + tag + ">");
            moveDisks(n - 1, buf, dest);
            //System.out.println("<move_top_from_" + this.index + "_to_" + dest.index + ">");
            //System.out.println("<before>");
            //System.out.println("<source_print>");
            this.print();
            //System.out.println("</source_print>");
            //System.out.println("<destination_print>");
            dest.print();
            buf.print();
            //System.out.println("</destination_print>");
            //System.out.println("</before>");
            moveTopToTower(dest);
            //System.out.println("<after>");
            //System.out.println("<source_print>");
            this.print();
            //System.out.println("</source_print>");
            //System.out.println("<destination_print>");
            dest.print();
            buf.print();
            //System.out.println("</destination_print>");
            //System.out.println("</after>");
            //System.out.println("</move_top_from_" + this.index + "_to_" + dest.index + ">");
            buf.moveDisks(n - 1, dest, this);
            //System.out.println("</" + tag + ">");
        }
    }

}
