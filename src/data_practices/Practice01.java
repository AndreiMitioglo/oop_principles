package data_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {


        /*
    Write a program that asks user to enter their date of year
    Then calculate their age and print with the message below

    EXPECTED OUTPUT:
    You are {age} years old!

 */
        Date date = new Date();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you year of birth");
        int YOB = scan.nextInt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

        System.out.println("Your are " + (Integer.parseInt(dateFormat.format(date))-YOB ) + " years old");

        //  System.out.println("You are " +
        //  (Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()))
        // - new Scanner(System.in).nextInt()) + " years old!");
    }
}
