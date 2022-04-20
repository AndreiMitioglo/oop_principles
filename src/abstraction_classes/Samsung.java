package abstraction_classes;

public class Samsung extends Phone{

    public static final String OS = "Android";
    public Samsung() {
    }

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public boolean isConvertible() {
        return false;
    }

    @Override
    public void call() {
        System.out.println("Samsung calls");
    }

    @Override
    public void ring() {
        System.out.println("Samsung rings");
    }



    @Override
    public void text() {
        System.out.println("Samsung texts");

    }
}