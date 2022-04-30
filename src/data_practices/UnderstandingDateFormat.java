package data_practices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {
        Date currentDate = new Date();

        System.out.println(currentDate); // Sat Apr 30 10:14:11 CDT 2022
    // MM/dd/yyyy  mm - reserved for the minutes
        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");

        System.out.println("Today is " + sdf.format(currentDate)); // Today is 04.30.2022

        // Print date Sat 10.27 am  format

      sdf = new SimpleDateFormat("E hh:mm a");
        System.out.println(sdf.format(currentDate)); // Sat 10:29 AM

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate)); // Saturday
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate)); // 2022


    }
}
