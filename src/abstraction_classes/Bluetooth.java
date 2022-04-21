package abstraction_classes;

public interface Bluetooth {

    void connectBluetooth();

    // Methods that has body

    // 1. static method
    static int getYear(){
        return 2022;
    }

    // 2. default method(non-static method that has body)
     default boolean isConnected(){
        return true;
    }
}
