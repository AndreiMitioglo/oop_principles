package polymorphism;

import java.util.LinkedList;
import java.util.List;

public class TestPolymorphism {
    public static void main(String[] args) {
        System.out.println("==== testing animal object=== ");
        Animal a1 = new Animal();
        a1.eat(); // Animal eats
        a1.sleep(); // Animal sleeps

        System.out.println("=== testing Dog object====");
        Dog d1 = new Dog();
        d1.eat(); // Dog eats
        d1.sleep(); // Dog sleeps
        d1.bark(); // Dog barks

        System.out.println("=== dog object in the shape of Animal");
        Animal a2 = new Dog();  // up-casting > polymorphism

       // a2.bark(); // compile error parent cannot use child method

        LinkedList<String> l1 = new LinkedList<>();
        List<String> l2 = new LinkedList<>();
              a2.eat("food"); // Animal eats food

    }
}
