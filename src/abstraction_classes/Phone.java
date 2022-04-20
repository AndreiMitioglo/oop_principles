package abstraction_classes;

public abstract class Phone {

    // Create a 4-args constructor
    // Generate > create constructor

    // Default constructor
    public  Phone(){

    }

    public Phone(String brand, String color, int storage, double price) {
        this.brand = brand;
        this.color = color;
        this.storage = storage;
        this.price = price;
    }

    public String brand;
    public String color;
    public int storage;
    public double price;

    public abstract boolean isConvertible();
    public abstract void call();  // methods with empty body
    public abstract void ring();
    public abstract void text();


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }
}
