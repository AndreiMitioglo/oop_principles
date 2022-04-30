package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CastingObject {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); // no casting

        /*
        Up-casting
        -putting smaller data into bigger- widening
        - it happens implicitly (auto)
         */

        Animal animal1 = new Cat(); // up-casting putting Cat into Animal
        List<Animal> animals = new ArrayList<>(); // up-casting

        /*
        Down-casting puts bigger into smaller
        - happens explicitly
        BUT; There could be data loss whit primitives
        There can be Exception
         */
//
//        Dog dog1 =(Dog) new Animal();  //
//        System.out.println(dog1); // location
        // Immediate use of down-casting is not possible, and you will get an error

        Animal a1 = new Dog(); // Dog in the shape of Animal(up-casted)
        Dog dog1 = (Dog)a1; // Down casting // Dog back to Animal

        a1.eat(); // Dog eats
        dog1.eat(); // Dog eats
    }
}
