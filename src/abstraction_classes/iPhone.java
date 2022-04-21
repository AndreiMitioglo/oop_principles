package abstraction_classes;

public class iPhone extends Phone implements Camera, Bluetooth{

    public static final String OS = "IOS";
    public iPhone() {
    }

    public iPhone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public boolean isConvertible() {
        return false;
    }

    @Override
    public void call() {
        System.out.println("iPhone calls");
    }

    @Override
    public void ring() {
        System.out.println("iPhone rings");
    }



    @Override
    public void text() {
        System.out.println("iPhone texts");


    }

    @Override
    public void takePhoto() {
        System.out.println("iPhone takes photo");
    }

    @Override
    public void connectBluetooth() {

    }
}
