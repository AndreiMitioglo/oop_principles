package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphicCollections {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        cat1.eat();
        cat1.sleep();
        cat1.eat("fish");

        System.out.println("===Dog object====");
        dog1.eat();
        dog1.sleep();
        dog1.eat("meat");

            System.out.println("===Animal object ===");
    Animal animal1 = new Animal();
    animal1.eat();
    animal1.eat("some food");
    animal1.sleep();
/*
    Create a Cat and a Dog object in the shape of Animal
    Invoke their eat() and sleep() methods which are zero arg
     */
        System.out.println("=== Cat and Dog object in Animal shape====");
        Animal animal2 = new Cat();
        animal2.eat(); //Cat eats
        animal2.sleep();// Cat sleeps

        Animal animal3 = new Dog();
        animal3.eat();
        animal3.sleep();

        // Animal, Cat, Dog

        Animal[] animals = {cat1, dog1, animal1, animal2, animal3};

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());  /*
        Cat
        Dog
        Animal
        Cat
        Dog
         */

        }

    // Store all object in the ArrayList and execute eat() fot each object
        // 1 st way
        ArrayList<Animal> animalList = new ArrayList<>(Arrays.asList(animals));
        for (Animal animal : animalList) {
            animal.eat();
        }
         // 3rd way
        new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat);

        //  2nd way to add

//        aa.add(cat1);
//        aa.add(dog1);
//        aa.add(animal1);
//        aa.add(animal2);
//        aa.add(animal3);

    }
}

