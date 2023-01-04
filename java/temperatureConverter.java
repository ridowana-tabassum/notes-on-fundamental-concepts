package labhw;

import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to enter Fahrenheit\nPress 2 to enter Celsius\nPress 3 to enter Kelvin");
        System.out.print("Your choice: ");
        int choice = scan.nextInt();

        if(choice == 1){
            // convert fahrenheit to celsius and kelvin
            System.out.println("---- Fahrenheit to Celsius and Kelvin ----");
            System.out.print("Enter Fahrenheit Temperature: ");
            double f = scan.nextDouble();
            System.out.println("Celsius is: "+fahrenheitToCelsius(f));
            System.out.println("Kelvin is: "+fahrenheitToKelvin(f));
        } else if(choice == 2){
            // convert celsius to fahrenheit and kelvin
            System.out.println("---- Celsius to Fahrenheit and Kelvin ----");
            System.out.print("Enter Celsius Temperature: ");
            double c = scan.nextDouble();
            System.out.println("Fahrenheit is: "+celsiusToFahrenheit(c));
            System.out.println("Kelvin is: "+celsiusToKelvin(c));
        } else if(choice == 3){
            // convert kelvin to celsius and fahrenheit
            System.out.println("---- Kelvin to Celsius and Fahrenheit ----");
            System.out.print("Enter Kelvin Temperature: ");
            double k = scan.nextDouble();
            System.out.println("Celsius is: "+kelvinToCelsius(k));
            System.out.println("Fahrenheit is: "+kelvinToFahrenheit(k));
        } else {
            System.out.println("Invalid Input!");
        }

    }

    public static double fahrenheitToCelsius(double f){
        double convCel = (f - 32) * 5/9;
        return Math.round(convCel * 10.0)/10.0;
    }

    public static double celsiusToFahrenheit(double c){
        double convFah = (c * 9/5) + 32;
        return Math.round(convFah * 10.0)/10.0;
    }

    public static double celsiusToKelvin(double c){
        double convKel = c + 273;
        return Math.round(convKel * 10.0)/10.0;
    }

    public static double fahrenheitToKelvin(double f){
        double fahToCel = fahrenheitToCelsius(f); // converting fahrenheit to celsius
        return fahToCel + 273; // converting celsius to kelvin
    }

    public static double kelvinToCelsius(double k){
        double convCel = k - 273;
        return Math.round(convCel * 10.0)/10.0;
    }

    public static double kelvinToFahrenheit(double k){
        double convCel = kelvinToCelsius(k); // converting kelvin to celsius
        return celsiusToFahrenheit(convCel); // converting celsius to fahrenheit
    }
}
