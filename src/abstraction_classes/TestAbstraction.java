package abstraction_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {


    /*
    Create an object of Samsung called as s1
    info it will have is as bellow
    Samsung
    Black
    64
    700
     */

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        iPhone i1 = new iPhone("iPhone", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>(); // all 3 phones are in here (Samsung + Nokia +iPhone)
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);
/*
    Print all objects
    Find and print the most expensive one with the message -> "The most expensive phone is = IPhone"
    Find and print how many phones are convertible -> 2
 */

        int countConvertibles = 0;
        int max = Integer.MIN_VALUE;
        Phone mostExpensivePhone = null; // container for object

        for (Phone phone : phones) {
            System.out.println(phone);
            if(phone.isConvertible()) countConvertibles++;
            if (phone.price > max) mostExpensivePhone = phone;

        }
        System.out.println(countConvertibles);
        System.out.println("The most expensive phone is " +
                mostExpensivePhone.getClass().getSimpleName()); // iPhone
        System.out.println("The color of most expensive phone is " + mostExpensivePhone.color); // Silver

        System.out.println(iPhone.OS);// invoking static instance variables
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

        for (Phone phone : phones) {
            phone.call();
            phone.ring();
            phone.text();
        }
    }

}
