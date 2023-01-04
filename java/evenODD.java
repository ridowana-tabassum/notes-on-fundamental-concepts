package labhw;
import java.util.Scanner;

public class evenODD {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("enter any integer: ");

        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

    }
}
