package encapsulation;

public class Car {

    // instance variables

    public String make;
    private double price; // require a password
    private int year;
    private boolean isConvertible = true; //

    // Providing indirect access to year to set and get info
    public void setYear(int year) {
        this.year = year;

    }

    public int getYear() {
        return this.year;
    }
// setting info
    public void setPrice(double price, String adminPassword) {
       if(adminPassword.equals("abcd1234")) this.price = price;
       else throw  new RuntimeException(" The password entered is not valid!!!!");

    }
 // getting info
    public double getPrice() {
         return price;
    }

    public boolean getIsConvertible(){
        return isConvertible;
    }
}