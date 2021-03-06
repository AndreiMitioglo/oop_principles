package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {

/*
    Create a food1 object and define below info for it
    taste = delicious
    name = sushi
    isSpicy = true
    isOrganic = true

    First, print the name of the food
    Then, print if the food is organic
    Finally, print the object itself
     */

        Food food1 = new Food();

        food1.taste = "delicios"; // direct acces
        food1.name = "sushi";
        food1.isSpicy = true;
        food1.setOrganic(true); // indirect access bcuse is private

        System.out.println(food1.name);
        System.out.println(food1.isOrganic());
        System.out.println(food1);
/*
/*
    Create a food1 object and define below info for it
    taste = good
    name = parseley
    isSpicy = false
    isOrganic = true
    color = green


    First, print the name of the food
    Then, print if the food is organic
    Finally, print the object itself
 */

       Vegetable vegetable1 = new Vegetable();

        vegetable1.taste = "good";
        vegetable1.name = "perseley";
        vegetable1.isSpicy= false;
        vegetable1.setOrganic(true);
        vegetable1.color = "green";

        System.out.println(vegetable1.name);
        System.out.println(vegetable1.color);
        System.out.println(vegetable1.isOrganic());

        System.out.println(vegetable1);

        /*
        Create another vegetable object and define only the name,
        name = broccoli
         */

        Vegetable vegetable2 = new Vegetable();
        vegetable2.name = "broccoli";

        System.out.println(vegetable2);
        /*

    /*
    I have one Food object -> sushi
    I have 2 Vegetable objects -> parsley, broccoli

    Count and print how many elements in the list has a name that has more than 5 characters

    RESULT:
             2
 */

        ArrayList<Food> allFoods = new ArrayList<>();

        allFoods.add(food1);
        allFoods.add(vegetable1);
        allFoods.add(vegetable2);

        int count = 0;
        for (Food food : allFoods) {
            if (food.name.length() >5) count++;

        }
        System.out.println(count);


   // second way to count
    System.out.println( allFoods.stream().filter(food -> food.name.length() >5 ).count());


    }
}
