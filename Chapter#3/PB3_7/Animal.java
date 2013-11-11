package Chapter3.PB3_7;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 8:38 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Animal {

    private int order;
    public String name;

    public Animal(String n){
        name = n;
    }

    public abstract String getName();

    public void setOrder(int o){
        order = o;
    }

    public int getOrder(){
        return order;
    }

    public boolean isOlderThan(Animal a){
        return this.order <= a.getOrder();
    }
}
