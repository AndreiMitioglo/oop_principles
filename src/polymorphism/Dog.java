package polymorphism;

public class Dog extends Animal{
    public void bark(){
        System.out.println("Dog bark");

    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleeps");
    }
}
