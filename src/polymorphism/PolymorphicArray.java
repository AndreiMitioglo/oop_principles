package polymorphism;

import java.util.ArrayList;

public class PolymorphicArray {
    public static void main(String[] args) {
        /*
        "Alex", "John", "Max"
        1, 2, 3, 4, 5,
        10.5
        'd', '$'
         */

        Object[] elements = {5, 10.5, true, false, new Dog(), new ArrayList(), new String[5]}; // Integer Double Boolean....
        for (Object element : elements) {
            System.out.println(element.getClass().getSimpleName());
        }
//       Dog dog1= (Dog)elements[5];
//        dog1.bark();
//        dog1.sleep();
//        }
    }
}

