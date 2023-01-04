package labhw;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// This code isn't showing the expected output.
// Maybe it has to do something with line 49.

public class DateToDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        // getting the year
        System.out.print("Enter any year: ");
        int year = scan.nextInt();
        if(year > 999 && year < 10000){
            cal.set(Calendar.YEAR, year);

            // getting the month
            System.out.print("Enter any month (e.g: press 05 for May): ");
            int month = scan.nextInt();
            if(month >= 1 && month <= 12){
                cal.set(Calendar.MONTH, month);

                // getting the day
                System.out.print("Enter any number of day: ");
                int day = scan.nextInt();
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                    if(day >= 1 && day <= 31){
                        cal.set(Calendar.DAY_OF_MONTH, day);
                    } else{
                        System.out.println("Invalid Input!");
                    }
                } else if(day >= 1 && day <= 30){
                    cal.set(Calendar.DAY_OF_MONTH, day);
                } else{
                    System.out.println("Invalid Input!");
                }
            } else{
                System.out.println("Invalid Input!");
            }

            // generating the result
            Date df = cal.getTime();
            DateFormat dff = new SimpleDateFormat("EEEEEEEE");
            String result = dff.format(df);
            System.out.println("\nThe calculated day is: "+result);

        } else{
            System.out.println("The range of year must be between 1000 to 9999");
        }

    }
}
