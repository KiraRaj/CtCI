package Chapter3.PB3_7;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 8:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class AnimalShelter {

    public LinkedList<Cat> cats = new LinkedList<Cat>();
    public LinkedList<Dog> dogs = new LinkedList<Dog>();

    public int order = 0;

    public AnimalShelter(){}

    public void enqueue(Animal animal){
        order++;
        animal.setOrder(order);
        if(animal instanceof Cat){
            cats.addLast((Cat) animal);
        }
        else if(animal instanceof Dog){
            dogs.addLast((Dog) animal);
        }
    }

    public Dog dequeueDog(){
        return dogs.removeFirst();
    }

    public Dog peekDog(){
        return dogs.getFirst();
    }

    public Cat dequeueCat(){
        return cats.removeFirst();
    }

    public Cat peekCat(){
        return cats.getFirst();
    }

    public Animal dequeueAny(){
        if(dogs.isEmpty())
            return dequeueCat();
        if(cats.isEmpty())
            return dequeueDog();

        Cat firstCat = peekCat();
        Dog firstDog = peekDog();
        if(firstDog.isOlderThan(firstCat))
            return dequeueDog();
        else
            return dequeueCat();
    }

    public int size(){
        return dogs.size() + cats.size();
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }
}
