package Chapter3.PB3_7;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    public String getName(){
        return "Dog " + name;
    }
}
