package Chapter3.PB3_7;

/**
 * Created with IntelliJ IDEA.
 * User: junleiwang
 * Date: 10/30/13
 * Time: 9:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class PB3_7 {

    public static void main(String[] args) {
        AnimalShelter animals = new AnimalShelter();
        animals.enqueue(new Cat("Callie"));
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Dog("Fido"));
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Cat("Copa"));

        System.out.println(animals.dequeueAny().getName());
        System.out.println(animals.dequeueAny().getName());
        System.out.println(animals.dequeueAny().getName());

        animals.enqueue(new Dog("Dapa"));
        animals.enqueue(new Cat("Kilo"));

        while (animals.size() != 0) {
            System.out.println(animals.dequeueAny().getName());
        }
    }
}
