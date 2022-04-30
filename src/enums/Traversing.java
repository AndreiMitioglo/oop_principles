package enums;

import sun.security.pkcs11.wrapper.Constants;

public class Traversing {
    public static void main(String[] args) {

        for (Day day : Day.values()) {
            System.out.println(day);
        }

        //Travers Mounts
        for (Constant.Month month : Constant.Month.values()) {
            System.out.println(month);

        }
    }
}
