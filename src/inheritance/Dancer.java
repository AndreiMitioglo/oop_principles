package inheritance;

public class Dancer extends Person {

    public Dancer() {

    }

    public Dancer(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void code() {
        System.out.println("Dancer code");
    }

    public void dance() {
        System.out.println("Dancer dans");
    }
}