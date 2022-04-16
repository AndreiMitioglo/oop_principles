package encapsulation;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        // setting info for make
        car1.make = "BMW";

        // getting info of make
        System.out.println(car1.make); // BMW

        // Setting info for year
        car1.setYear(2020);

    //Getting info ot year
        System.out.println(car1.getYear()); // 2020

        //car1.setPrice(5000, "Hello world"); //The password entered is not valid!!!!
        car1.setPrice(5000, "abcd1234"); // 5000.0
        System.out.println(car1.getPrice());// 5000.0

//        car1.setPrice(4000); // reasignment
       System.out.println(car1.getPrice());// 4000.0

        System.out.println(car1.getIsConvertible()); // true

    }
}
