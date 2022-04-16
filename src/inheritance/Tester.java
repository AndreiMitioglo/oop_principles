package inheritance;

public class Tester extends  Person{

    public Tester(){

    }

    public Tester(String fName, String lName, int age, String gender) {
//        this.fName = fName;
//        this.lName = lName;
//        this.age = age;
//        this.gender = gender;
           super(fName, lName, age, gender);
    }

    public void code(){//// override the parent method
        System.out.println("Tester code");
    }
    @Override
    public void eat(){ // override the parent method
        System.out.println("Tester eats");
    }

    @Override
    public void sleep() { // override the parent method
        System.out.println("Tester sleeps");
    }

    @Override
    public void learn() { // override the parent method
        System.out.println("Tester learns");
    }

    @Override
    public void walk() {
        System.out.println("Tester walks");
    }
}
