package Chapter3.PB3_7;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 8:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    public String getName(){
        return "Cat " + name;
    }
}
